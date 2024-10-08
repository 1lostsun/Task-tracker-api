package lost.code.store.entities;

import lombok.*;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "task")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(unique = true)
	private String name;

	private String description;

	@Builder.Default
	private Instant createdAt = Instant.now();

}
