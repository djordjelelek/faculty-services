package fpn.service.impementation;

import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpn.entity.Student;
import fpn.repository.StudentRepository;
import fpn.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student getStudent(UUID indexNumber) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void insertClient(@Valid Student1 student) {
//		studentRepository.save(student);
//		
//	}

}
