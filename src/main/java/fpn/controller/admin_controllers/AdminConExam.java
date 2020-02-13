package fpn.controller.admin_controllers;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fpn.entity.Exam;
import fpn.service.admin.AdminServiceExam;

@RestController
public class AdminConExam {
	
	@Autowired
	AdminServiceExam adminServiceExam;
	
	@RequestMapping (value = "/admin/save_exam", method = RequestMethod.POST)
	public Exam saveExam(@RequestBody @Valid Exam exam) {
		adminServiceExam.saveExam(exam);
		return exam;
	}
	
	@RequestMapping (value = "/admin/exam/{id_exam}", method = RequestMethod.GET)
	public Exam getExam(@PathVariable("id_exam") UUID idExam) {
		Exam exam = adminServiceExam.getExam(idExam);
		return exam;
	}
	
	
}
