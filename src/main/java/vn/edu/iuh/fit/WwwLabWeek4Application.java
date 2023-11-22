package vn.edu.iuh.fit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.repositories.CandidateRepository;

@SpringBootApplication
public class WwwLabWeek4Application {
	private CandidateRepository candidateRepository;
	public static void main(String[] args) {

		SpringApplication.run(WwwLabWeek4Application.class, args)
		;
	}
	@Bean
	CommandLineRunner test01(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				candidateRepository.findAll().forEach(System.out::println);
			}
		};
	}

}
