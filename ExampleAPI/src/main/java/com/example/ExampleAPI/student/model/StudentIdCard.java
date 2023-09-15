package com.example.ExampleAPI.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor  
@Entity(name = "Student_id_card")
@Table(
		name="student_id_card",
		uniqueConstraints = {
				@UniqueConstraint(name="student_card_number_unique",columnNames="card_number")
		}
		)

public class StudentIdCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="student_id",nullable = false)
	private Student student_id;
	
	@Column(name="card_number", nullable = false, unique = true)
	private String card_number;
	


	public StudentIdCard(Student student_id, String card_number) {
		super();
		this.student_id = student_id;
		this.card_number = card_number;
	}
	
	
}
