package fpn.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fpn.entity.Exam;

@Repository
public interface ExamRepository  extends JpaRepository<Exam, UUID>{

}
