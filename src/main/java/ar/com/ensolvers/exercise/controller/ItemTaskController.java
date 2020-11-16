package ar.com.ensolvers.exercise.controller;

import ar.com.ensolvers.exercise.model.ItemTask;
import ar.com.ensolvers.exercise.service.ItemTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemTaskController {

    @Autowired
    private ItemTaskService itemTaskService;

    @GetMapping("/tasks/item/{id}")
    ItemTask findById(@PathVariable Long id) {
        return this.itemTaskService.findById(id);
    }

    @PostMapping("/tasks/item/create")
    public ItemTask create(@RequestBody ItemTask itemTask) {
        return this.itemTaskService.create(itemTask);
    }

    @PutMapping("/tasks/item/edit")
    public ItemTask edit(@RequestBody ItemTask itemTask) {
        return this.itemTaskService.edit(itemTask);
    }

    @DeleteMapping("/tasks/item/{id}")
    public void deleteById(@PathVariable Long id) {
        this.itemTaskService.deleteById(id);
    }
}
