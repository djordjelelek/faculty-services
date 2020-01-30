package fpn.service;

import java.util.UUID;

import javax.validation.Valid;

import fpn.entity.Student;




public interface StudentService {

	Student getStudent(UUID indexNumber);

	void insertStudent(@Valid Student student);

	void addExam(UUID exam_id, UUID student_id);

}
