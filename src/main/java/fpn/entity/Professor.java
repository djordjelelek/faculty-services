package fpn.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table (name = "professor")
public class Professor extends Human{
//	@OneToMany
//	@Column (name = "exams_professor")
//	private Exam exam;
	@Column (name = "sallary")
	private float sallary;
}
