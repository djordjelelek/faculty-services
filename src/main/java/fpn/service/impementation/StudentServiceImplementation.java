package fpn.service.impementation;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpn.entity.Exam;
import fpn.entity.Student;
import fpn.repository.ExamRepository;
import fpn.repository.StudentRepository;
import fpn.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	ExamRepository examRepository;

	@Override
	public Student getStudent(UUID indexNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertStudent(@Valid Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public void addExam(UUID exam_id, UUID student_id) {
		Student student = studentRepository.findById(student_id).get();
		Exam exam = examRepository.findById(student_id).get();
		List<Exam> list = student.getExams();
		list.add(exam);
		studentRepository.save(student);
		
		
	}


}
