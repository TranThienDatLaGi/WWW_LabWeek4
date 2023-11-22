package vn.edu.iuh.fit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.repositories.CandidateRepository;

import java.util.Optional;

@SpringBootTest
public class CandidateTest {
    @Autowired
    private CandidateRepository candidateRepository;

    @Test
    void insert(){
        Candidate candidate = new Candidate(1001L,"Tran Thien Dat","Dat@gmail.com","012345678","123 a 456 b");
        candidateRepository.insert(candidate);
        Optional<Candidate> candidateOptional = candidateRepository.findById(1001L);
        Assertions.assertTrue(candidateOptional.isPresent());
    }
}