package com.yogisoft.helper;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentErrorDetails {
	
	
	private String msg ;
	
	private LocalDateTime datetimedetails;
	
	private Integer statusCode;

}
