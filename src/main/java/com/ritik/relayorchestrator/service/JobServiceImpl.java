package com.ritik.relayorchestrator.service;

import com.ritik.relayorchestrator.dto.CreateJobRequest;
import com.ritik.relayorchestrator.entity.Job;
import com.ritik.relayorchestrator.enums.JobStatus;
import com.ritik.relayorchestrator.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public Job createJob(CreateJobRequest request) {

        Job job = new Job();

        job.setJobName(request.getJobName());
        job.setPayload(request.getPayload());
        job.setScheduledTime(request.getScheduledTime());
        job.setJobType(request.getJobType());
        job.setStatus(JobStatus.PENDING);
        job.setCreatedAt(LocalDateTime.now());
        job.setUpdatedAt(LocalDateTime.now());

        return jobRepository.save(job);
    }
}