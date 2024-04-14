package com.thesis.taskflow.dtos.task;

import lombok.Data;

@Data
public class ModifyEstimateTimeRequest {
    private int taskId;
    private int estimateTime;
}
