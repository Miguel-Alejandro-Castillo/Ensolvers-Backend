package ar.com.ensolvers.exercise.dao;

import ar.com.ensolvers.exercise.model.ItemTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTaskRepository extends JpaRepository<ItemTask, Long> {
}
