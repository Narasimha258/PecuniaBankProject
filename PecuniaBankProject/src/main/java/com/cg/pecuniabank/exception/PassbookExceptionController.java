package com.cg.pecuniabank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class PassbookExceptionController {
	
	@ExceptionHandler(value=AccountDoesntExistException.class)
	public ResponseEntity<Object> handleException(AccountDoesntExistException accountDetailsException)
	{
		return new ResponseEntity<>(accountDetailsException.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=TransactionFailedException.class)
	public ResponseEntity<Object> handleException1(TransactionFailedException transactionsNotFoundException)
	{
		return new ResponseEntity<>(transactionsNotFoundException.getMessage(),HttpStatus.NOT_FOUND);	
	}

}
