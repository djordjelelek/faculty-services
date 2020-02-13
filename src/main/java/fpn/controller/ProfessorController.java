package fpn.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fpn.entity.Exam;
import fpn.entity.Professor;
import fpn.service.student_professor.ProfessorService;



@RestController
public class ProfessorController {
	@Autowired
	ProfessorService professorService;
	
	@RequestMapping(value = "/professor/profile/{id}", method = RequestMethod.GET)
	public Professor getProfessorProfile(@PathVariable("id") UUID id) {
		Professor professor = professorService.getProfessor(id);	
	 return professor;
	}
	
	@Transactional
	@RequestMapping(value = "/professor/exams/{id}", method = RequestMethod.GET)
	public List<Exam> getAllExams(@PathVariable("id") UUID id) {
		List<Exam> examList = professorService.getExams(id);
		return examList;
	}
}
