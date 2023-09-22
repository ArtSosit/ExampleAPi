package com.example.ExampleAPI.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor  
@Entity(name = "Course")

@Table(name ="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name="name",nullable = false)
	private String name;
	
	@Column(name="department",nullable = false)
	private String department;
	
	

	public Course(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
}
