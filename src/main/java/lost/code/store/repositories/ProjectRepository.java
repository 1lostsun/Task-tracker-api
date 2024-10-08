package lost.code.store.repositories;

import lost.code.store.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
	Optional<ProjectEntity> findByName(String name);
}
