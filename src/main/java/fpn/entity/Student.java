package fpn.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Human {

	@Column(name = "year")
	@Min(value = 1)
	@Max(value = 4)
	private int year;
	@Column(name = "budget")
	private boolean budget;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "students", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Exam> exams;
	
	
	public void addExam(Exam exam){
		exams.add(exam);
	}

}
