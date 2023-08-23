package com.bitlabs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bitlabs.entity.JobRecruiter;
import com.bitlabs.entity.User;
import com.bitlabs.repo.JobRecruiterRepository;

@Service
public class JobRecruiterService {
  JobRecruiterRepository recruiterRepository;

    @Autowired
    public JobRecruiterService(JobRecruiterRepository recruiterRepository) {
        this.recruiterRepository = recruiterRepository;
    }

    public ResponseEntity<String> saveRecruiter(JobRecruiter recruiter) {
        // Check if the email already exists in the database
        if (recruiterRepository.existsByEmail(recruiter.getEmail())) {
            return ResponseEntity.badRequest().body("Email already registered");
        }

        // Save the recruiter if the email is not already registered
        recruiterRepository.save(recruiter);
        return ResponseEntity.ok("Recruiter registered successfully");
    }
    public boolean login(String email, String password) {
        JobRecruiter recruiter = recruiterRepository.findByEmail(email);

        if (recruiter != null && recruiter.getPassword().equals(password)) {
            return true; // Login successful
        } else {
            return false; // Login failed
        }
    }
    public JobRecruiter findById(Long id) {
       return recruiterRepository.findByrecruiterId(id);
        
    }
    public List<JobRecruiter> getAllJobRecruiters() {
        return recruiterRepository.findAll();
    }
    

    // You can add more methods here for updating, deleting, finding recruiters, etc.

	
}