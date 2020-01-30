package fpn.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Pattern;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Human {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column
	private String name, surname;
	@Column (name = "status")
	@Pattern (regexp = "(?:student|professor)")
	private String status;
}
