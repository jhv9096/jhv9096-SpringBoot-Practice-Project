package com.jhv9096springboot.task_manager_practice.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TaskStatus {
    OPEN,
    IN_PROGRESS,
    DONE;

    @JsonCreator
    public static TaskStatus fromString(String value) {
        return TaskStatus.valueOf(value.toUpperCase());
    }
}
