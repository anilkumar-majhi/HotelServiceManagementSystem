package com.arms.org.ExceptionHandler;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(UsersNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUsersnotFound(UsersNotFoundException ux){
		
		ErrorResponse err=new ErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				ux.getMessage(),
				LocalDateTime.now()
				
				);
		

		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
		
	}

}
