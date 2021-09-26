package pl.khayn.dev.todolist.controller;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.khayn.dev.todolist.model.ToDoItem;
import pl.khayn.dev.todolist.repository.ToDoRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {

	@Autowired
	private ToDoRepository toDoRepository;

	@GetMapping
	public List<ToDoItem> findAll(){
		return toDoRepository.findAll();
	}

	@PostMapping
	public ToDoItem save(@Valid @NotNull @RequestBody ToDoItem toDoItem){
		return toDoRepository.save(toDoItem);
	}

	@PutMapping
	public ToDoItem update(@Valid @NotNull @RequestBody ToDoItem toDoItem){
		return toDoRepository.save(toDoItem);
	}

	@DeleteMapping(value = "/{id}")
	public void delete (@PathVariable Long id){
		toDoRepository.deleteById(id);
	}
}
