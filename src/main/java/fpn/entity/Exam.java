package fpn.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exam")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private UUID id;
	private String name;
//	@OneToMany
//	private Student student; 
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "professor_id")
	private Professor professor;
}
