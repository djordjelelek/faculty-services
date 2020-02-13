package fpn.service.student_professor.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpn.entity.Exam;
import fpn.entity.Professor;
import fpn.repository.ProfessorRepository;
import fpn.service.student_professor.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService{
	@Autowired
	ProfessorRepository professorRepository;

	@Override
	public Professor getProfessor(UUID id) {
		Professor professor = professorRepository.findById(id).get();
		return professor;
	}

	@Override
	public List<Exam> getExams(UUID id) {
		Professor professor = professorRepository.getOne(id);
		List<Exam> examList = professor.getExams();
		return examList;
	}

}
