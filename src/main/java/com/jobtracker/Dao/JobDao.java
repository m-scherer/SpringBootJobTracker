package com.jobtracker.Dao;

import com.jobtracker.Entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class JobDao {

    @Autowired
    private static Map<Integer, Job> jobs;

    static {
        jobs = new HashMap<Integer, Job>(){
            {
                put(1, new Job(1, "Senior Developer", "Turing"));
                put(2, new Job(2, "Mid Developer", "Turing"));
                put(3, new Job(3, "Junior Developer", "Turing"));
            }
        };
    }

    public Collection<Job> getAllJobs(){
        return this.jobs.values();
    }

    public Job getJobById(int id) {
        return this.jobs.get(id);
    }

    public void removeJobById(int id) {
        this.jobs.remove(id);
    }

    public void updateJobById(int id, String paramName, String paramCompany) {
        Job job = jobs.get(id);
        job.setCompany(paramCompany);
        job.setName(paramName);
        jobs.put(job.getId(), job);
    }

    public void createJob(String paramsName, String paramCompany) {
        int id = jobs.keySet().size();
        jobs.put(id, new Job (id, paramsName, paramCompany));
    }
}
