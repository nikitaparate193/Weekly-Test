package com.example.JobPortal.Job.Portal.controller;

import com.example.JobPortal.Job.Portal.model.Job;
import com.example.JobPortal.Job.Portal.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class JobController {

    @Autowired
    JobService jobService;

    //crud operation
    @PostMapping("jobs")
    public void addJob(@Valid @RequestBody Job job){
        jobService.addJob(job);
    }

    @GetMapping("jobs")
    public Iterable<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @PutMapping("jobs/{id}/{title}")
    public String updateJobTitle(@PathVariable Long id, @PathVariable String title){
        return jobService.updateJobTitle(id,title);
    }

    @DeleteMapping("job/{id}")
    public String deleteJob(@PathVariable Long id){
        return jobService.deleteJob(id);
    }



    //custome Finders
    //job by id
    @GetMapping("job/{id}")
    public Job getJobById(@PathVariable Long id){
        return jobService.getJobById(id);
    }

//    job by title
    @GetMapping("job/title/{title}")
    public List<Job> getJobByTitle(@PathVariable String title){
        return jobService.getJobByTitle(title);
    }

    @GetMapping("job/location/{location}")
    public List<Job> getJobByLocation(@PathVariable String location){
        return jobService.getJobByLocation(location);
    }

    @GetMapping("job/companyName/{companyName}")
    public List<Job> getJobByCompanyName(@PathVariable String companyName){
        return jobService.getJobByCompanyName(companyName);
    }


    //query
    @GetMapping("job/id/{id}")
    public Job getAllJobById(@PathVariable Long id){
        return jobService.getAllJobById(id);
    }

    @PutMapping("job/id/{id}/companyName/{companyName}")
    public String updateCompanyNameById(@PathVariable  Long id,@PathVariable  String companyName){
        jobService.updateCompanyNameById(id,companyName);
        return "updated";
    }

    @PutMapping("job/id/{id}/location/{location}")
    public String updateJobLocationById(@PathVariable  Long id,@PathVariable  String location){
        jobService.updateJobLocationById(id,location);
        return "updated";
    }

    @DeleteMapping("job/id/{id}")
    public String deleteJobById(@PathVariable  Long id){
        jobService.deleteJobById(id);
        return "deleted";
    }



}
