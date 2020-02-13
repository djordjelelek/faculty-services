package fpn.service.admin.implementation;

import java.util.UUID;

import javax.validation.Valid;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpn.entity.Exam;
import fpn.entity.Student;
import fpn.repository.ExamRepository;
import fpn.repository.StudentRepository;
import fpn.service.admin.AdminServiceExam;

@Service
public class AdminServiceImplExam implements AdminServiceExam {

	@Autowired
	private ExamRepository examRepository;
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void saveExam(@Valid Exam exam) {
		examRepository.save(exam);

	}

	@Override
	public Exam getExam(UUID idExam) {
		Exam exam = examRepository.findById(idExam).get();
		return exam;
	}

	@Override
	public void saveExamStudent(UUID idStudent, UUID idExam) {

		Exam exam = examRepository.findById(idExam).get();
		Hibernate.initialize(exam.getStudents());
		Student student = studentRepository.findById(idStudent).get();
		exam.addStudent(student);
		examRepository.save(exam);

	}
	@Override
	public void deleteExamStudent(UUID idStudent, UUID idExam) {  //!!!!!!!!!!!!
		Exam exam = examRepository.findById(idExam).get();
		Hibernate.initialize(exam.getStudents());
		
		Student student = studentRepository.findById(idStudent).get();
		
		exam.deleteStudent(student);
		
		examRepository.save(exam);
		
	}

}
