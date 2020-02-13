package fpn.service.student_professor;

import java.util.List;
import java.util.UUID;

import fpn.entity.Exam;
import fpn.entity.Professor;

public interface ProfessorService {

	Professor getProfessor(UUID id);

	List<Exam> getExams(UUID id);

}
