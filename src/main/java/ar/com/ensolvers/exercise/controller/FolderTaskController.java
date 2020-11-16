package ar.com.ensolvers.exercise.controller;

import ar.com.ensolvers.exercise.model.FolderTask;
import ar.com.ensolvers.exercise.service.FolderTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FolderTaskController {

    @Autowired
    private FolderTaskService folderTaskService;

    @GetMapping("/tasks/folder/{id}")
    FolderTask findById(@PathVariable Long id) {
        return this.folderTaskService.findById(id);
    }

    @GetMapping("/tasks/folders/{ownerId}")
    FolderTask findByIdAndOwnerId(@PathVariable Long ownerId) {
        return this.folderTaskService.findByOwnerId(ownerId);
    }

    @PostMapping("/tasks/folder/create")
    public FolderTask create(@RequestBody FolderTask folderTask) {
        return this.folderTaskService.create(folderTask);
    }

    @PutMapping("/tasks/folder/edit")
    public FolderTask edit(@RequestBody FolderTask folderTask) {
        return this.folderTaskService.edit(folderTask);
    }

    @DeleteMapping("/tasks/folder/{id}")
    public void deleteById(@PathVariable Long id) {
        this.folderTaskService.deleteById(id);
    }
}

