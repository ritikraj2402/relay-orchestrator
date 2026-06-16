package com.ritik.relayorchestrator.dto;

import com.ritik.relayorchestrator.enums.JobType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CreateJobRequest {
    private String jobName;
    private JobType jobType;
    private String payload;
    private LocalDateTime scheduledTime;
}