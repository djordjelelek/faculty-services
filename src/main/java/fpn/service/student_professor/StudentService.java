package fpn.service.student_professor;

import java.util.List;
import java.util.UUID;

import fpn.entity.Exam;
import fpn.entity.Student;




public interface StudentService {

	Student getStudent(UUID indexNumber);

	List<Exam> getExams(UUID id);

}
