package fpn.controller.admin_controllers;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping (value = "/admin/get_professor/{id}", method = RequestMethod.GET)
	public Professor getProfessor(@PathVariable("id") UUID id) {
		Professor professor = adminServiceProfessor.getProfessor(id);
		return professor;
	}

	@RequestMapping(value = "/admin/save_professor", method = RequestMethod.POST)
	public Professor saveProfessor(@RequestBody @Valid Professor professor) {
		adminServiceProfessor.saveProfessor(professor);
		return professor;
	}
	
	@RequestMapping (value = "/admin/update_professor", method = RequestMethod.PUT)
	public Professor updateStudent(@RequestBody @Valid Professor professor) {
		adminServiceProfessor.updateProfessor(professor);
		return professor;
	}
	
	@RequestMapping (value = "/admin/delete_professor/{id}", method = RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("id") UUID id) {
		adminServiceProfessor.deleteProfessor(id);
		return "Sucessful delete the professor with id: " + id;
	}
}
