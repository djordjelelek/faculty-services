package fpn.service.admin.implementation;

import java.util.UUID;

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

	@Override
	public Professor getProfessor(UUID id) {
		Professor professor = professorRepository.findById(id).get();
		return professor;
	}

	@Override
	public void updateProfessor(@Valid Professor professor) {
		professorRepository.save(professor);
		
	}

	@Override
	public void deleteProfessor(UUID id) {
		professorRepository.deleteById(id);;
		
	}
	
	

	

}
