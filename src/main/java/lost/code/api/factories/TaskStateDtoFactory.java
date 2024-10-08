package lost.code.api.factories;

import lost.code.api.dto.TaskStateDto;
import lost.code.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoFactory {

	public TaskStateDto makeTaskStateDto(TaskStateEntity entity) {

		return TaskStateDto.builder()
				.id(entity.getId())
				.name(entity.getName())
				.ordinal(entity.getOrdinal())
				.createdAt(entity.getCreatedAt())
				.build();

	}

}
