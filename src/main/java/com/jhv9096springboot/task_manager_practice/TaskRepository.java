package com.jhv9096springboot.task_manager_practice;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TaskRepository {
    private final Map<Long, Task> tasks = new HashMap<>();
    private Long nextId = 1L;

    public List<Task> findAll() {
        return new ArrayList<>(tasks.values());
    }

    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(tasks.get(id));
    }

    public Task save(Task task) {
        task.setId(nextId++);
        tasks.put(task.getId(), task);
        return task;
    }

    public void delete(Long id) {
        tasks.remove(id);
    }

    public Task update(Long id, Task updatedTask) {
        updatedTask.setId(id);
        tasks.put(id, updatedTask);
        return updatedTask;
    }

}
