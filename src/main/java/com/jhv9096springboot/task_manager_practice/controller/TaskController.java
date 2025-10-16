package com.jhv9096springboot.task_manager_practice.controller;

import com.jhv9096springboot.task_manager_practice.model.Task;
import com.jhv9096springboot.task_manager_practice.repository.TaskRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@SuppressWarnings("unused") //All methods here are called via annotation
public class TaskController {
    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        //replaces need for if-else block. If id is found, return that. Else, throw exception.
    }

    @PostMapping
    public Task createTask(@Valid @RequestBody Task task) {
        return repository.save(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @Valid @RequestBody Task task) {
        //return repository.update(id, task);
        return repository.findById(id)
                .map(existingTask -> {
                    existingTask.setTitle(task.getTitle());
                    existingTask.setDescription(task.getDescription());
                    existingTask.setStatus(task.getStatus());
                    existingTask.setDueDate(task.getDueDate());
                    return repository.save(existingTask);
                })
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        //repository.delete(id);
        repository.deleteById(id);
    }

}
