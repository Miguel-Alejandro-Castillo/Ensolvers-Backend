package ar.com.ensolvers.exercise.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@JsonTypeName("ITEM")
@Entity
@Table(name="ITEMS_TASKS")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class ItemTask extends Task {

    @Column(nullable = false)
    private boolean completed;

    public ItemTask() {
        super();
        this.completed = false;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
