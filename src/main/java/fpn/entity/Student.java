package fpn.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "student")
public class Student extends Human{
//	@OneToMany
//	@Column (name = "exams_listening")
//	private Exam exam;
	
	@Column (name = "year")
	@Min(value = 1)
	@Max(value = 4)
	private int year;
	@Column(name = "budget")
	private boolean budget;


	
}
