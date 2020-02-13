package fpn.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import fpn.entity.Student;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {

}
