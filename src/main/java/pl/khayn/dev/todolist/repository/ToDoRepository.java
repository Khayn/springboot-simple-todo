package pl.khayn.dev.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.khayn.dev.todolist.model.ToDoItem;

public interface ToDoRepository extends JpaRepository<ToDoItem,Long> {

}
