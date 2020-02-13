package fpn.service.admin;

import java.util.UUID;

import javax.validation.Valid;

import fpn.entity.Exam;

public interface AdminServiceExam {

	void saveExam(@Valid Exam exam);

	Exam getExam(UUID idExam);

	void saveExamStudent(UUID idStudent, UUID idExam);

	void deleteExamStudent(UUID idStudent, UUID idExam);

}
