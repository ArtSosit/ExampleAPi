package com.example.ExampleAPI.student.model;




import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
	@JoinColumn(name="student_id" ,nullable = false,referencedColumnName = "id")
	@Fetch(FetchMode.JOIN)
	private Student studentId;
	
	@Column(name="book_name",nullable = false)
	private String book_name;
	
	@CreationTimestamp
	@Column(name="created_at",nullable = false,
			updatable = false,insertable = false,
		    columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime created_at;

	

	public Book(Student studentId, String book_name, LocalDateTime created_at) {
		super();
		this.studentId = studentId;
		this.book_name = book_name;
		this.created_at = created_at;
	}
	
}
