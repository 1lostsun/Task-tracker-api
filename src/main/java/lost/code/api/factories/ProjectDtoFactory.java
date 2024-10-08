package lost.code.api.factories;

import lost.code.api.dto.ProjectDto;
import lost.code.store.entities.ProjectEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectDtoFactory {

	public ProjectDto makeProjectDto(ProjectEntity entity) {

		return ProjectDto.builder()
				.id(entity.getId())
				.name(entity.getName())
				.createdAt(entity.getCreatedAt())
				.build();
	}

}
