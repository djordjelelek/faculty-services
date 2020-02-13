package fpn.service.admin;

import java.util.UUID;

import javax.validation.Valid;

import fpn.entity.Professor;

public interface AdminServiceProfessor {

	void saveProfessor(@Valid Professor professor);

	Professor getProfessor(UUID id);

	void updateProfessor(@Valid Professor professor);

	void deleteProfessor(UUID id);

	

}
