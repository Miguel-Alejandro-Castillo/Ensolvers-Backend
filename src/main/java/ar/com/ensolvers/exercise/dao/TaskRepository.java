package ar.com.ensolvers.exercise.dao;

import ar.com.ensolvers.exercise.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
