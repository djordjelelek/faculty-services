package fpn.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fpn.entity.Student;
import fpn.service.StudentService;

@RestController
public class StudentController{
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/wellcome", method = RequestMethod.GET)
	public String wellcome() {
		return "hallo";
	}
	
	@RequestMapping(value = "/my_profile/{id}", method = RequestMethod.GET)
	public Student information(@PathVariable("id") UUID indexNumber) {
	 Student student1 = studentService.getStudent(indexNumber);	
	 return student1;
	}
	
	@RequestMapping (value = "/insertStudent", method = RequestMethod.POST)
	public Student insertStudent (@RequestBody @Valid Student student) {
		studentService.insertStudent(student);
		return student;
	}
	
	@RequestMapping (value = "/students/insert_exam/{exam_id}/student{student_id}", method = RequestMethod.POST)
	public String insertExam(@PathVariable("exam_id") UUID exam_id, @PathVariable("student_id") UUID student_id) {
		studentService.addExam(exam_id, student_id);
		return "Sucesful insert a exam";
	}

}
