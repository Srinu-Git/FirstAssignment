package com.srinu.exception;

import java.util.Date;

import lombok.Data;

@Data
public class ErrorDetails {
	
	
	private Date timestamp;
    private String message;
    private String details;
    
    public ErrorDetails(Date date, String message2, String description) {
	}

}
