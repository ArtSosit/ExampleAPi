package com.example.ExampleAPI.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExampleAPI.student.model.StudentIdCard;
import com.example.ExampleAPI.student.respository.StudentIDCardRepository;
@Service
public class StudentIDCardService implements IStudentIDCard{

	@Autowired
	StudentIDCardRepository studentIDCardRepository;
	
	@Override
	public List<StudentIdCard> findAllstudentIdCards() {
		// TODO Auto-generated method stub
		return studentIDCardRepository.findAll();
	}

	@Override
	public StudentIdCard findById(long id) {
		// TODO Auto-generated method stub
		return studentIDCardRepository.findById(id);
	}

	@Override
	public StudentIdCard findByCardNumberContaining(String name) {
		// TODO Auto-generated method stub
		return studentIDCardRepository.findByCardNumberContaining(name);
	}

	@Override
	public StudentIdCard findByStudentId(long id) {
		// TODO Auto-generated method stub
		return studentIDCardRepository.findByStudentId(id);
	}

	@Override
	public void deletebyId(long id) {
		// TODO Auto-generated method stub
		studentIDCardRepository.deleteById(id);
	}

}
