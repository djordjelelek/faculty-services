package fpn.service.admin.implementation;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpn.entity.Exam;
import fpn.entity.Student;
import fpn.repository.StudentRepository;
import fpn.service.admin.AdminServiceStudent;

@Service
public class AdminServiceImplStudent implements AdminServiceStudent{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void saveStudent(@Valid Student student) {
		studentRepository.save(student);
	}

	@Override
	public Student getStudent(UUID indexNumber) {
		Student student = studentRepository.findById(indexNumber).get();
		return student;
	}

	@Override
	public List<Exam> getExamsStudents(UUID indexNumber) {  //@!!!!!!!!!!!!!!!!!!!!!!!!!!
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveExamStudent(UUID idStudent, UUID idExam) {   //!!!!!!!!!!!!!!!!!!!
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deleteStudent(UUID indexNumber) {  //!!!!!!!!!!!!
		if(studentRepository.existsById(indexNumber)) {
			
			
			
			
			return "Sucessful deleta the student";
		}else {
			return "Student with index number: " + indexNumber + " does not exist!";
		}
	}

	@Override
	public void deleteExamStudent(UUID idStudent, UUID idExam) {  //!!!!!!!!!!!!
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(@Valid Student student) {   //!!!!!!!!!!!!!
		// TODO Auto-generated method stub
		
	}

}
