package com.example.ExampleAPI.student.json;

import java.util.ArrayList;
import java.util.List;

import com.example.ExampleAPI.student.model.Student;
import com.example.ExampleAPI.student.model.StudentIdCard;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class StudentIDCardListJson {
	private long id;
	private Student student;
	private String cardNumber;
	public static StudentIDCardListJson packJson(StudentIdCard studentIdCard) {
		StudentIDCardListJson sIdlj = new StudentIDCardListJson();
		sIdlj.setId(studentIdCard.getId());
		sIdlj.setStudent(studentIdCard.getStudent_id());
		sIdlj.setCardNumber(studentIdCard.getCard_number());
		return sIdlj;
		
	}
	public static List<StudentIDCardListJson> packJsons(List<StudentIdCard> studentIdCards){
		List<StudentIDCardListJson> studentIDCardListJson = new ArrayList<StudentIDCardListJson>();
 		for(StudentIdCard studentIdCard : studentIdCards) {
 			studentIDCardListJson.add(packJson(studentIdCard));
 		}
		return studentIDCardListJson;
		}
	
		
	
}
