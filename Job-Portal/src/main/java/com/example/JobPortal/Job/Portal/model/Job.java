package com.example.JobPortal.Job.Portal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Job")
public class Job {

    @Id
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private String location;

    @NotNull
    @Min(value = 20000, message = "Salary should be at least 20000")
    private Double salary;

    @NotNull
    @Email
    private String companyEmail;

    @NotNull
    private String companyName;

    @NotNull
    private String employerName;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Type jobType;

    @NotNull
    private LocalDate appliedDate;
}
