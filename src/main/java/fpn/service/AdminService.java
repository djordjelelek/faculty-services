package fpn.service;

import java.util.UUID;

import javax.validation.Valid;

import fpn.entity.Exam;
import fpn.entity.Professor;
import fpn.entity.Student;

public interface AdminService {


	void saveStudent(@Valid Student student);

	void saveProfessor(@Valid Professor professor);

	void saveExam(@Valid Exam exam);

	void saveExamStudent(UUID idStudent, UUID idExam);

}
