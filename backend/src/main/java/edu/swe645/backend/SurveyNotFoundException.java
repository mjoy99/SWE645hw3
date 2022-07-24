package edu.swe645.backend;

public class SurveyNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	SurveyNotFoundException(Long id) {
      super("Could not find survey " + id);
    }
}