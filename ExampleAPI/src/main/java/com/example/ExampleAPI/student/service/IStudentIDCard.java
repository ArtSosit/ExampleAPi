package com.example.ExampleAPI.student.service;

import java.util.List;

import com.example.ExampleAPI.student.model.StudentIdCard;

public interface IStudentIDCard {
	List<StudentIdCard> findAllstudentIdCards();
	StudentIdCard findById(long id);
	StudentIdCard findByCardNumberContaining(String name);
	StudentIdCard findByStudentId(long id);
	void deletebyId(long id);
}
