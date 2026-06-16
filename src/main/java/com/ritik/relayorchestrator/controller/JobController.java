package com.ritik.relayorchestrator.controller;

import com.ritik.relayorchestrator.dto.CreateJobRequest;
import com.ritik.relayorchestrator.entity.Job;
import com.ritik.relayorchestrator.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public ResponseEntity<Job> createJob(@RequestBody CreateJobRequest request){
        Job job = jobService.createJob(request);
        return ResponseEntity.ok(job);
    }

}