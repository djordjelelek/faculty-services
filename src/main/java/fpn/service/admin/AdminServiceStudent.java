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

	String deleteStudent(UUID indexNumber);

	void updateStudent(@Valid Student student);

}
