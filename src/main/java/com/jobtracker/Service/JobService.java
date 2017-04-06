package com.jobtracker.Service;

import com.jobtracker.Dao.JobDao;
import com.jobtracker.Entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class JobService {

    @Autowired
    private JobDao jobDao;

    public Collection<Job> getAllJobs(){
        return jobDao.getAllJobs();
    }
}
