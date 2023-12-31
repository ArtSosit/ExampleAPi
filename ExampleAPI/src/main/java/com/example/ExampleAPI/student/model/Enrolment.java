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
@Entity(name = "Enrolment")
@Table(name ="enrolment")
public class Enrolment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="student_id",nullable = false,referencedColumnName = "id")
	@Fetch(FetchMode.JOIN)
	private Student student_id;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="course_id" ,nullable = false,referencedColumnName = "id")
	@Fetch(FetchMode.JOIN)
	private Course course_id;
	
	@CreationTimestamp
    @Column(name="created_at",nullable = false,
    updatable = false,insertable = false,
    columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime created_at;

	public Enrolment(Student student_id, Course course_id, LocalDateTime created_at) {
		super();
		this.student_id = student_id;
		this.course_id = course_id;
		this.created_at = created_at;
	}

    
	

	
	
	


	
}