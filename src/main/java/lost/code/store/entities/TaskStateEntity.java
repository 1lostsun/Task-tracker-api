package lost.code.store.entities;

import lombok.*;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "task_state")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskStateEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(unique = true)
	private String name;

	private Long ordinal;

	@Builder.Default
	private Instant createdAt = Instant.now();

	@OneToMany
	@Builder.Default
	@JoinColumn(name = "task_state_id", referencedColumnName = "id")
	private List<TaskEntity> tasks = new ArrayList<>();

}
