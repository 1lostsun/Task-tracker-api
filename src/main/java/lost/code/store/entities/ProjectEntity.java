package lost.code.store.entities;

import lombok.*;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(unique = true)
	private String name;

	@Builder.Default
	private Instant createdAt = Instant.now();

	@OneToMany
	@Builder.Default
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	private List<TaskStateEntity> taskStates = new ArrayList<>();

}
