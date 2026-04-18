package za.ac.cput.repository;

import za.ac.cput.domain.Job;
import java.util.*;

public class JobRepository implements IJobRepository{

    private static IJobRepository repository = null;
    private List<Job> jobList;

    private JobRepository(){
        jobList = new ArrayList<>();
    }


    public static IJobRepository getRepository(){
        if (repository == null){
            repository = new JobRepository();
        }
        return repository;
    }

    @Override
    public Job create(Job job) {
        boolean success = jobList.add(job);
        if (success){
            return job;
        }
        return null;
    }

    @Override
    public Job read(String jobNumber) {
        for (Job job: jobList){
            if (job.getJobNumber().equals(jobNumber)) {
                return job;
            }
        }
        return null;
    }

    @Override
    public Job update(Job job) {
        String jobNumber = job.getJobNumber();
        Job oldJob = read(jobNumber);
        if (oldJob == null) {
            return null;
        }
        boolean success = jobList.remove(oldJob);
        if (success){
            if (jobList.add(job)) {
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String jobNumber) {
        Job jobToDelete = read(jobNumber);
        if (jobToDelete == null) {
            return false;
        }
        return (jobList.remove(jobToDelete));
    }

    @Override
    public List<Job> getAll() {
        return jobList;
    }
}