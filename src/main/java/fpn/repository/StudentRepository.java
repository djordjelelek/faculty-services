package fpn.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import fpn.entity.Student;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, UUID> {

}
