package ar.com.ensolvers.exercise.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="FOLDERS_TASKS")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class FolderTask extends Task {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "folder_task_id")
    private List<Task> items;

    public FolderTask() {
        super();
        this.items = new ArrayList<>();
    }

    public List<Task> getItems() {
        return items;
    }

    public void setItems(List<Task> items) {
        this.items = items;
    }

}
