package com.jobtracker.Controller;

import com.jobtracker.Entity.Job;
import com.jobtracker.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteJobById(@PathVariable("id") int id){
        jobService.removeJobById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Job updateJobById(@PathVariable("id") int id, @RequestParam("name") String paramName, @RequestParam("company") String paramCompany) {
        jobService.updateJobById(id, paramName, paramCompany);
        return jobService.getJobById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Collection<Job> createJob(@RequestParam("name") String paramsName, @RequestParam("company") String paramCompany) {
        int id = jobService.getAllJobs().size() + 1;
        jobService.createJob(new Job(id, paramsName, paramCompany));
        return jobService.getAllJobs();
    }
}
