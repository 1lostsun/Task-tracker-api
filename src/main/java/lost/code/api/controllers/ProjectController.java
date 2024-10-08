package lost.code.api.controllers;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lost.code.api.dto.ProjectDto;
import lost.code.api.exceptions.BadRequestException;
import lost.code.api.factories.ProjectDtoFactory;
import lost.code.store.entities.ProjectEntity;
import lost.code.store.repositories.ProjectRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Transactional
@RestController
public class ProjectController {

	private final ProjectRepository projectRepository;
	private final ProjectDtoFactory projectDtoFactory;
	public static final String CREATE_PROJECT = "/api/projects";

	@PostMapping(CREATE_PROJECT)
	public ProjectDto createProject(@RequestParam String name) {

		projectRepository
				.findByName(name)
				.ifPresent(project -> {
			throw new BadRequestException("Project already exists");
		});

//		ProjectEntity entity = projectRepository.save();
//
//		return projectDtoFactory.makeProjectDto();

		return null;
	}
}
