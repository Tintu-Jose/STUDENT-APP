package com.ust.model;



import javax.persistence.Column;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Student {
	@Id
	@GeneratedValue
	private Integer stdId;  
	@NonNull
	@Column
	private String stdName;          
	@NonNull
	@Column
	private Double stdFee;      
	@NonNull
	@Column
	private String stdCourse;



}