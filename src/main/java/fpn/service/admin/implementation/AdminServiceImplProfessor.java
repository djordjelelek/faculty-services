package fpn.service.admin.implementation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpn.entity.Professor;
import fpn.repository.ProfessorRepository;
import fpn.service.admin.AdminServiceProfessor;

@Service
public class AdminServiceImplProfessor implements AdminServiceProfessor {

	@Autowired
	private ProfessorRepository professorRepository;

	@Override
	public void saveProfessor(@Valid Professor professor) {
		professorRepository.save(professor);
	}

}
