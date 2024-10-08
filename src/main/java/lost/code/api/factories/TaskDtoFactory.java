package lost.code.api.factories;

import lost.code.api.dto.TaskDto;
import lost.code.store.entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {

	public TaskDto makeTaskDto(TaskEntity entity) {

		return TaskDto.builder()
				.id(entity.getId())
				.name(entity.getName())
				.description(entity.getDescription())
				.createdAt(entity.getCreatedAt())
				.build();

	}

}
