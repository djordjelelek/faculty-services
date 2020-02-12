package fpn.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fpn.entity.Exam;
import fpn.entity.Student;
import fpn.service.StudentService;

@RestController
public class StudentController{
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping(value = "/student/profile/{id}", method = RequestMethod.GET)
	public Student StudentProfile(@PathVariable("id") UUID indexNumber) {
	 Student student = studentService.getStudent(indexNumber);	
	 return student;
	}
	
	@RequestMapping(value = "/student/exams/{id}", method = RequestMethod.GET)
	public List<Exam> getAllExams(@PathVariable("id") UUID indexNumber) {
		List<Exam> examList = studentService.getExams(indexNumber);
		return examList;
	}
	

}
