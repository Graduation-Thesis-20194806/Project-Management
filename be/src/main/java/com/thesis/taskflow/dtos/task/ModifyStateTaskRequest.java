package com.thesis.taskflow.dtos.task;

import com.thesis.taskflow.entities.EnumState;
import lombok.Data;

@Data
public class ModifyStateTaskRequest {
    private int taskId;
    private EnumState newState;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public EnumState getNewState() {
        return newState;
    }

    public void setNewState(EnumState newState) {
        this.newState = newState;
    }
}
