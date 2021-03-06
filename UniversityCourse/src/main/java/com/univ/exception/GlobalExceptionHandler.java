package com.univ.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	// handling specific exception
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundHandling(ResourceNotFoundException exception, WebRequest request){
		ErrorDetails errorDetails = 
				new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

	// handling global exception
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalExceptionHandling(Exception exception, WebRequest request){
		ErrorDetails errorDetails = 
				new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

    // handling specific exception
    @ExceptionHandler(ApplicantNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundHandling(ApplicantNotFoundException exception, WebRequest request){
        ErrorDetails errorDetails = 
                new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

	
		 // handling specific exception
    @ExceptionHandler(StaffNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundHandling(StaffNotFoundException exception, WebRequest request){
        ErrorDetails errorDetails = 
                new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
	
    @ExceptionHandler(DuplicateUserMailIdException .class)
    public ResponseEntity<?> duplicateUserMailIdException(DuplicateUserMailIdException exception, WebRequest request){
        ErrorDetails errorDetails = 
                new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
 
 @ExceptionHandler(BadcredentialsException .class)
    public ResponseEntity<?> badcredentialsException(BadcredentialsException exception, WebRequest request){
        ErrorDetails errorDetails = 
                new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
	

	
}
