package vn.edu.iuh.fit.www_labweek4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.repositories.CandidateRepository;

@SpringBootTest
class WwwLabWeek4ApplicationTests {
private CandidateRepository candidateRepository;
	@Test
	void contextLoads() {
		Candidate candidate=
				new Candidate(1001L,"Tran Thien Dat",
						"Dat@gmail.com",
						"012345678","123 a 456 b");
		candidateRepository.insert(candidate);
		Candidate candidate1=candidateRepository.findById(1001L).get();
		Assertions.assertEquals("Dat@gmail.com",candidate1.getEmail());

	}

}
