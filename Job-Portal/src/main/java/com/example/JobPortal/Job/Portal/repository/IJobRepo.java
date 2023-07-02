package com.example.JobPortal.Job.Portal.repository;

import com.example.JobPortal.Job.Portal.model.Job;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job,Long> {
    Job findJobById(Long id);

    List<Job> findJobByTitle(String title);

    List<Job> findAllJobByLocation(String location);

    List<Job> findAllJobByCompanyName(String companyName);
    @Query(value="select * from job where id = :id", nativeQuery = true)
    Job getAllJobById(Long id);

    @Modifying
    @Transactional
    @Query(value = "update JOB j set j.COMPANY_NAME = :companyName where j.ID =:id", nativeQuery = true)
    void updateCompanyNameById(String companyName,Long id);

    @Modifying
    @Transactional
    @Query(value = "update JOB j set j.LOCATION = :location where j.ID =:id", nativeQuery = true)
    void updateJobLocationById(String location, Long id);

    @Modifying
    @Transactional
    @Query(value="Delete from JOB where ID= :id" , nativeQuery = true)
    void deleteJobById(Long id);
}
