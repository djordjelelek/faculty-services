package fpn.controller.admin_controllers;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fpn.entity.Exam;
import fpn.entity.Student;
import fpn.service.admin.AdminServiceStudent;

@RestController
public class AdminConStudent {
	
	@Autowired
	private AdminServiceStudent adminServiceStudent;
	
	@RequestMapping(value = "/admin/student/profile/{id}", method = RequestMethod.GET)
	public Student StudentProfile(@PathVariable("id") UUID indexNumber) {
	 Student student = adminServiceStudent.getStudent(indexNumber);	
	 return student;
	}
	
	@RequestMapping(value = "/admin/student/exams/{id}", method = RequestMethod.GET)
	public List<Exam> getAllExams(@PathVariable("id") UUID indexNumber) {
		List<Exam> examList = adminServiceStudent.getExamsStudents(indexNumber);
		return examList;
	}
	
	@RequestMapping (value = "/admin/save_student", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody @Valid Student student) {
		adminServiceStudent.saveStudent(student);
		return student;
	}
	
	
	@RequestMapping (value = "/admin/update_student", method = RequestMethod.PUT)
	public Student updateStudent(@RequestBody @Valid Student student) {
		adminServiceStudent.updateStudent(student);
		return student;
	}
	
	@RequestMapping(value = "/admin/delete_student/{id}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("id") UUID indexNumber) {
		String answer = adminServiceStudent.deleteStudent(indexNumber);
		return answer;
	}
	
}
