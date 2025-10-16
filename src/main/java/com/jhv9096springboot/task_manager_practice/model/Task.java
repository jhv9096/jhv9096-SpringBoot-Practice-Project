package com.jhv9096springboot.task_manager_practice.model;

import com.jhv9096springboot.task_manager_practice.enums.TaskStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity
public class Task {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Title is required")
    @Size(max = 100, message = "Title must be under 100 characters")
    private String title;

    @Size(max = 500, message = "Description must be under 500 characters")
    private String description;

    @NotNull(message = "Status is required")
    private TaskStatus status; // e.g., "OPEN", "IN_PROGRESS", "DONE"

    //@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Due date must be in YYYY-MM-DD format")
    //private String dueDate; //ISO string, regex in bean forces YYYY-MM-DD format
    @Future(message = "Due date must be in the future")
    private LocalDate dueDate;

    // Constructors
    public Task() {}

    public Task(Long id, String title, String description, TaskStatus status, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public TaskStatus getStatus() { return status; }
    public void setStatus(TaskStatus status) { this.status = status; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

}
