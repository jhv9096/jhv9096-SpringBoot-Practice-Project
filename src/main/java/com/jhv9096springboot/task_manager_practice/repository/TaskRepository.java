package com.jhv9096springboot.task_manager_practice.repository;

import com.jhv9096springboot.task_manager_practice.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

public interface TaskRepository extends JpaRepository<Task, Long> {
    //All required functions; such as findById, save, and delete; are built-in to JpaRepository.
}
//@Repository
//public class TaskRepository {
//    private final Map<Long, Task> tasks = new HashMap<>();
//    private Long nextId = 1L;
//
//    public List<Task> findAll() {
//        return new ArrayList<>(tasks.values());
//    }
//
//    public Optional<Task> findById(Long id) {
//        return Optional.ofNullable(tasks.get(id));
//        //Either returns the task with the requested id, or returns null if it cannot find a task with matching id.
//    }
//
//    public Task save(Task task) {
//        task.setId(nextId++);
//        tasks.put(task.getId(), task);
//        return task;
//    }
//
//    public void delete(Long id) {
//        tasks.remove(id);
//    }
//
//    public Task update(Long id, Task updatedTask) {
//        updatedTask.setId(id);
//        tasks.put(id, updatedTask);
//        return updatedTask;
//    }
//
//}
