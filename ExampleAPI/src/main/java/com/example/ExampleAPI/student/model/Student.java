package com.example.ExampleAPI.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@RequiredArgsConstructor  
@ToString
@Entity(name = "Student")
@Table(
	name ="student",
	uniqueConstraints = {
		@UniqueConstraint(name="student_email_unique",columnNames = "email")
	}
)
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name ="first_name",nullable = false)
	private String first_name;
	
	@Column(name ="last_name",nullable = false)
	private String last_name;
	
	@Column(name ="email",unique=true, nullable = false)
	private String email;
	
	@Column(name ="age",nullable = false)
	private Integer age;
	
	
	
	public Student(String first_name, String last_name, String email, Integer age) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.age = age;
	}
}
