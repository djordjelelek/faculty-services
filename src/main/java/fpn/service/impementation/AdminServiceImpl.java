package fpn.service.impementation;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpn.entity.Exam;
import fpn.entity.Professor;
import fpn.entity.Student;
import fpn.repository.ExamRepository;
import fpn.repository.ProfessorRepository;
import fpn.repository.StudentRepository;
import fpn.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ProfessorRepository professorRepository;
	@Autowired
	private ExamRepository examRepository;

	@Override
	public void saveStudent(@Valid Student student) {
		studentRepository.save(student);
	}

	@Override
	public void saveProfessor(@Valid Professor professor) {
		professorRepository.save(professor);
	}


	@Override
	public void saveExam(@Valid Exam exam) {
		examRepository.save(exam);
	}

	@Override
	public void saveExamStudent(UUID idStudent, UUID idExam) {
		Student student = studentRepository.findById(idStudent).get();
		List<Exam> examList = student.getExams();
		Exam exam = examRepository.findById(idExam).get();
		examList.add(exam);
		student.setExams(examList);
		studentRepository.save(student);
		
	}

}
