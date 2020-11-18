package ar.com.ensolvers.exercise.service;

import ar.com.ensolvers.exercise.dao.ItemTaskRepository;
import ar.com.ensolvers.exercise.model.ItemTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemTaskService {

    @Autowired
    private ItemTaskRepository itemTaskRepository;

    public ItemTask create(ItemTask itemTask) {
        return this.itemTaskRepository.save(itemTask);
    }

    public ItemTask edit(ItemTask itemTask){
        return this.itemTaskRepository.save(itemTask);
    }

    public void deleteById(Long id) {
        this.itemTaskRepository.deleteById(id);
    }

    public ItemTask findById(Long id) {
        return this.itemTaskRepository.getOne(id);
    }

    public List<ItemTask> findByOwnerId(Long ownerId) {
        return this.itemTaskRepository.findByOwnerId(ownerId);
    }
}
