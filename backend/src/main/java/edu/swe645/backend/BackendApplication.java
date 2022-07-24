package edu.swe645.backend;

import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}

@Component
class SurveyCommandLineRunner implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		for(Survey s : this.surveyRepository.findAll()) {
			System.out.println(s.toString());
		}
	}

	@Autowired SurveyRepository surveyRepository;
}

interface SurveyRepository extends JpaRepository<Survey, Long> {
    Collection<Survey> findBySurveyID(Long id);
}
