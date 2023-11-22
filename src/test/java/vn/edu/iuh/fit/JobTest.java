package vn.edu.iuh.fit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vn.edu.iuh.fit.repositories.JobRepository;
import vn.edu.iuh.fit.models.Job;
import java.util.Optional;

@SpringBootTest
public class JobTest {
    @Autowired
    private JobRepository jobRepository;

    @Test
    void insert(){
        Job job = new Job(1l, "BackEnd Developer", "Application developer", "Quan 1");
        jobRepository.insert(job);
        Optional<Job> optionalJob = jobRepository.findById(1l);
        Assertions.assertTrue(optionalJob.isPresent());
    }
}