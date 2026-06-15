package com.ritik.relayorchestrator.entity;

import com.ritik.relayorchestrator.enums.JobStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobName;

    private String jobType;

    private String payload;

    @Enumerated(EnumType.STRING)
    private JobStatus status;

    private LocalDateTime scheduledTime;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}