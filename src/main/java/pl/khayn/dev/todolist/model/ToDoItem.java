package pl.khayn.dev.todolist.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ToDoItem {

	@Id
	@GeneratedValue
	private Long id;

	@NotBlank
	private String title;

	private boolean done;
}
