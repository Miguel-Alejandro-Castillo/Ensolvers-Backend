package ar.com.ensolvers.exercise.dao;

import ar.com.ensolvers.exercise.model.FolderTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FolderTaskRepository extends JpaRepository<FolderTask, Long> {

    List<FolderTask> findByOwnerId(Long ownerId);
}
