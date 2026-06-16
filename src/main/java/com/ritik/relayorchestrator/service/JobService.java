package com.ritik.relayorchestrator.service;


import com.ritik.relayorchestrator.dto.CreateJobRequest;
import com.ritik.relayorchestrator.entity.Job;

public interface JobService {

    Job createJob(CreateJobRequest request);

}