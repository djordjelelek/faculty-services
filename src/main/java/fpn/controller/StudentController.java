package fpn.controller;

import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fpn.entity.Student;
import fpn.service.StudentService;

@RestController
public class StudentController implements ApplicationListener<ContextRefreshedEvent>{
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

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
	}
	
//	@RequestMapping (value = "/insertStudent", method = RequestMethod.POST)
//	public String insertStudent (@RequestBody @Valid Student1 student) {
//		studentService.insertClient(student);
//		return "Sucessful insert a student";
//	}

}
