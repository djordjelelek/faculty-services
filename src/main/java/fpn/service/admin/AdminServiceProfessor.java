package fpn.service.admin;

import javax.validation.Valid;

import fpn.entity.Professor;

public interface AdminServiceProfessor {

	void saveProfessor(@Valid Professor professor);

}
