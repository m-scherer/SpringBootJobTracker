package com.jobtracker.Controller;

import com.jobtracker.Entity.Job;
import com.jobtracker.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService ;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Job getJobById(@PathVariable("id") int id){
        return jobService.getJobById(id);
    }
}
