package com.example.ExampleAPI.student.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExampleAPI.student.model.StudentIdCard;
@Repository
public interface StudentIDCardRepository extends JpaRepository<StudentIdCard, Long>{
	StudentIdCard findById(long id);
	StudentIdCard findByStudentId(long id);
	StudentIdCard findByCardNumberContaining(String number);
}
