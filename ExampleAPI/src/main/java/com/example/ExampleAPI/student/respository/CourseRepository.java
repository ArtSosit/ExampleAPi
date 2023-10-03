package com.example.ExampleAPI.student.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExampleAPI.student.model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	Course findById(long id);
	Course findByStudentId(long id);
	Course findByBookNameContaining(String bookName);
	Course findByDepartmentContaining(String departmentName);
}
