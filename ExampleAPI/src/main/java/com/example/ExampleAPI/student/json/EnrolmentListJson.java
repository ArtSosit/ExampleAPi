package com.example.ExampleAPI.student.json;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.ExampleAPI.student.model.Course;
import com.example.ExampleAPI.student.model.Enrolment;
import com.example.ExampleAPI.student.model.Student;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EnrolmentListJson {
	private long id;
	private Student student;
	private Course course;
	private LocalDateTime createdAt;
	public static EnrolmentListJson packJson(Enrolment enrolment) {
		EnrolmentListJson elj = new EnrolmentListJson();
		elj.setId(enrolment.getId());
		elj.setStudent(enrolment.getStudent_id());
		elj.setCourse(enrolment.getCourse_id());
		elj.setCreatedAt(enrolment.getCreated_at());
		
		return elj;
	}
	public static List<EnrolmentListJson> packJsons(List<Enrolment> enrolments) {
		List<EnrolmentListJson> elj = new ArrayList<EnrolmentListJson>();
		for(Enrolment enrolment : enrolments) {
			elj.add(packJson(enrolment));
		}
		return elj;
		// TODO Auto-generated constructor stub
	}
}
