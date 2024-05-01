package com.yogisoft.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String collegeId;
	
	private String collegeName;
	
	private String collegeAddress;

}
