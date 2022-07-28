package edu.swe645.backend;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;

@RestController
@Path("swe645hw3")
public class SurveyController {
    
    private SurveyRepository repository;

    SurveyController(SurveyRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping ("/surveys")
    List<Survey> getAll() {
        return repository.findAll();
    }

    @CrossOrigin
    @PostMapping ("/surveys")
    Survey addSurvey(@RequestBody Survey newSurvey) {
        return repository.save(newSurvey);
    }
}