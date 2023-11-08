package edu.cesur.fullstack.exeptions.handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import edu.cesur.fullstack.exeptions.ArtworkCreationException;
import edu.cesur.fullstack.exeptions.artistNotFoundException;

@RestControllerAdvice
public class GlobalExeptionHandler {
	
	@ExceptionHandler( artistNotFoundException.class )
	public ProblemDetail handleartistNotFoundException(artistNotFoundException e) {

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Artwork Exception Occurred");
		problemDetail.setType(URI.create("http://cesurformacion.com"));
		problemDetail.setProperty("errorCategory", "Artwork");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}
	
	@ExceptionHandler( ArtworkCreationException.class )
	public ProblemDetail handleArtworkCreationException(ArtworkCreationException e) {

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
		problemDetail.setTitle("CrearArtwork Exception Occurred");
		problemDetail.setType(URI.create("http://cesurformacion.com"));
		problemDetail.setProperty("errorCategory", "CrearArtwork");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}

}
