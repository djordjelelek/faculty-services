package fpn.service.admin;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import fpn.entity.Exam;
import fpn.entity.Student;

public interface AdminServiceStudent {

	void saveStudent(@Valid Student student);

	Student getStudent(UUID indexNumber);

	List<Exam> getExamsStudents(UUID indexNumber);

	void saveExamStudent(UUID idStudent, UUID idExam);

	String deleteStudent(UUID indexNumber);

	void deleteExamStudent(UUID idStudent, UUID idExam);

	void updateStudent(@Valid Student student);

}
