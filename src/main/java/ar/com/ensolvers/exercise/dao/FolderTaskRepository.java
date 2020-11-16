package ar.com.ensolvers.exercise.dao;

import ar.com.ensolvers.exercise.model.FolderTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderTaskRepository extends JpaRepository<FolderTask, Long> {

    FolderTask findByOwnerId(Long ownerId);
}
