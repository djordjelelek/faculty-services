package fpn.controller.admin_controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fpn.entity.Professor;
import fpn.service.admin.AdminServiceProfessor;

@RestController
public class AdminConProfessor {
	@Autowired
	private AdminServiceProfessor adminServiceProfessor;

	@RequestMapping(value = "/save_professor", method = RequestMethod.POST)
	public Professor saveProfessor(@RequestBody @Valid Professor professor) {
		adminServiceProfessor.saveProfessor(professor);
		return professor;
	}

}
