package fpn.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import fpn.entity.Student;

import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends CrudRepository<Student, UUID>{

}
