package fpn.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fpn.entity.Exam;
import fpn.entity.Professor;
import fpn.entity.Student;
import fpn.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping (value = "/save_student", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody @Valid Student student) {
		adminService.saveStudent(student);
		return student;
	}
	@RequestMapping (value = "/save_professor", method = RequestMethod.POST)
	public Professor saveProfessor(@RequestBody @Valid Professor professor) {
		adminService.saveProfessor(professor);
		return professor;
	}
	@RequestMapping (value = "/save_exam", method = RequestMethod.POST)
	public Exam saveExam(@RequestBody @Valid Exam exam) {
		adminService.saveExam(exam);
		return exam;
	}
	@RequestMapping (value = "/exam/student/{id_student}/{id_exam}", method = RequestMethod.POST)
	public String saveExamStudent(@PathVariable("id_student") UUID idStudent, @PathVariable("id_exam") UUID idExam) {
		adminService.saveExamStudent(idStudent, idExam);
		return "Sucessful post exam on student account";
	}
	
	
	
}
