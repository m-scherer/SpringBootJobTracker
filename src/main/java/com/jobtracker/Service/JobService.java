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
        return this.jobDao.getAllJobs();
    }

    public Job getJobById(int id) {
        return this.jobDao.getJobById(id);
    }

    public void removeJobById(int id) {
        this.jobDao.removeJobById(id);
    }

    public void updateJobById(int id, String paramName, String paramCompany) {
        this.jobDao.updateJobById(id, paramName, paramCompany);
    }
}
