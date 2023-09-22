package com.example.ExampleAPI.student.model;



import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@RequiredArgsConstructor  
@Entity(name = "Book")

@Table(name ="book")

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="student_id" ,nullable = false)
	private Student student_id;
	
	@Column(name="book_name",nullable = false)
	private String book_name;
	
	@CreationTimestamp
	@Column(name="created_at",nullable = false,
			updatable = false,insertable = false,
		    columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDate created_at= LocalDate.now();

	

	public Book(Student student_id, String book_name, LocalDate created_at) {
		super();
		this.student_id = student_id;
		this.book_name = book_name;
		this.created_at = created_at;
	}
	
}
