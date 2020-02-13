package fpn.service.student_professor.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fpn.entity.Exam;
import fpn.entity.Student;
import fpn.repository.StudentRepository;
import fpn.service.student_professor.StudentService;

@Service
@Transactional
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;


	@Override
	public Student getStudent(UUID indexNumber) {
		Student student = studentRepository.findById(indexNumber).get();
		return student;
	}

	@Override
	public List<Exam> getExams(UUID id) {
		Student student = studentRepository.findById(id).get();
		student.getExams().size();
		return student.getExams();
	}

	


}
