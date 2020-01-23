package fpn.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "professor")
public class Professor extends Human{
	@Column (name = "sallary")
	private float sallary;
	@OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
	private List<Exam> exams;
}
