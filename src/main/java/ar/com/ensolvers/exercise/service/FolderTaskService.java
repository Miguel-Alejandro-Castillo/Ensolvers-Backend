package ar.com.ensolvers.exercise.service;

import ar.com.ensolvers.exercise.dao.FolderTaskRepository;
import ar.com.ensolvers.exercise.model.FolderTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FolderTaskService {

    @Autowired
    private FolderTaskRepository folderTaskRepository;

    public FolderTask findById(Long id) {
        return this.folderTaskRepository.getOne(id);
    }

    public FolderTask findByOwnerId(Long ownerId) {
        return this.folderTaskRepository.findByOwnerId(ownerId);
    }

    public FolderTask create(FolderTask folderTask) {
        return this.folderTaskRepository.save(folderTask);
    }

    public FolderTask edit(FolderTask folderTask) {
        return this.folderTaskRepository.save(folderTask);
    }

    public void deleteById(Long id) {
        this.folderTaskRepository.deleteById(id);
    }

}
