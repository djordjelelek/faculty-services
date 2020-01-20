package fpn.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
//	@OneToMany
//	@Column (name = "exams_listening")
//	private Exam exam;
	@Id
	@Column(name = "im", updatable = false, nullable = false)
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private Long indexNumber;
	private String kurac;
}
