package fpn.service.admin.implementation;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpn.entity.Exam;
import fpn.repository.ExamRepository;
import fpn.service.admin.AdminServiceExam;

@Service
public class AdminServiceImplExam implements AdminServiceExam{
	
	@Autowired
	private ExamRepository examRepository;

	@Override
	public void saveExam(@Valid Exam exam) {
		examRepository.save(exam);
		
	}

	@Override
	public Exam getExam(UUID idExam) {
		Exam exam = examRepository.findById(idExam).get();
		return exam;
	}

}
