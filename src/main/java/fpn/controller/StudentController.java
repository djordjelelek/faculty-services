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
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/wellcome", method = RequestMethod.GET)
	public String wellcome() {
		return "hallo";
	}
	
	@RequestMapping(value = "/my_profile/{id}", method = RequestMethod.GET)
	public Student information(@PathVariable("id") UUID indexNumber) {
	 Student student = studentService.getStudent(indexNumber);	
	 return student;
	}
	
//	@RequestMapping (value = "/insertStudent", method = RequestMethod.POST)
//	public String insertStudent (@RequestBody @Valid Student student) {
//		studentService.insertClient(student);
//		return "Sucessful insert a student";
//	}

}
