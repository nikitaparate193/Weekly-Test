package com.example.JobPortal.Job.Portal.service;

import com.example.JobPortal.Job.Portal.model.Job;
import com.example.JobPortal.Job.Portal.repository.IJobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    IJobRepo jobRepo;

    //custome finder


//    public List<Job> getJobByTitle() {
//    }

    public Job getJobById(Long id) {
        return jobRepo.findJobById(id);
    }

    public void addJob(Job job) {
        jobRepo.save(job);
    }

    public List<Job> getJobByTitle(String title) {
        return jobRepo.findJobByTitle(title);
    }

    public Iterable<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public String updateJobTitle(Long id, String title) {
        Optional<Job> myJobOpt =jobRepo.findById((id));
        Job myJob=null;
        if(myJobOpt.isPresent()){
            myJob=myJobOpt.get();
        }else{
            return "Id not found";
        }
        myJob.setTitle(title);
        jobRepo.save(myJob);
        return "job Title updated";
    }

    public String deleteJob(Long id) {
        jobRepo.deleteById(id);
        return "job profile deleted";
    }

    public List<Job> getJobByLocation(String location) {
        return jobRepo.findAllJobByLocation(location);
    }

    public List<Job> getJobByCompanyName(String companyName) {
        return jobRepo.findAllJobByCompanyName(companyName);
    }

    public Job getAllJobById(Long id) {
        return jobRepo.getAllJobById(id);
    }

    public void updateCompanyNameById(Long id,String companyName){
        jobRepo.updateCompanyNameById(companyName,id);
    }

    public void updateJobLocationById(Long id, String location) {
        jobRepo.updateJobLocationById(location,id);
    }

    public void deleteJobById(Long id) {
        jobRepo.deleteJobById(id);
    }
}
