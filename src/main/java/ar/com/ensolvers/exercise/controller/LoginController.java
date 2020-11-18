package ar.com.ensolvers.exercise.controller;

import ar.com.ensolvers.exercise.component.UserDetailsImpl;
import ar.com.ensolvers.exercise.dao.UserRepository;
import ar.com.ensolvers.exercise.model.User;
import ar.com.ensolvers.exercise.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private JwtUtils jwtUtils;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody User user) {
        //passwprd 1234
        // $2a$10$ztAHRNlqHJe88CZi2xcBvODErftMPrA4nHUwFky8Iv9IgPm2a.ZZC
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        /*
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());
        */

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Authorization", "Bearer " + jwt);

        return ResponseEntity.ok()
                .headers(responseHeaders)
                .body(userDetails);

        /*
        return ResponseEntity.ok(new JwtResponse(jwt,
                userDetails.getId(),
                userDetails.getUsername(),
                userDetails.getEmail(),
                roles));

         */
    }


}