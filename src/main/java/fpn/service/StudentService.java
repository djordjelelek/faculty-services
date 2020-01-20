package fpn.service;

import java.util.UUID;

import javax.validation.Valid;

import fpn.entity.Student;



public interface StudentService {

	public Student getStudent(UUID indexNumber);

//	public void insertClient(@Valid Student student);

}
