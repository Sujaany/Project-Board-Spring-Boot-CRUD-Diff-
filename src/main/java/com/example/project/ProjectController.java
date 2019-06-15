package com.example.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders="*")
@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	@GetMapping("/project")
	public List<Project> viewProject(){
	return projectService.viewProject();
	}
	
	@PostMapping("/project")
	public void addProject(@RequestBody Project project) {
		projectService.addProject(project);
	}
	@PutMapping("/project/{id}")
	public void updateProject(@RequestBody Project project,@PathVariable Long id) {
		projectService.updateProject(id, project);
	}
	
	@DeleteMapping("/project/{id}")
	public void deleteDepartment(@PathVariable Long id) {
		projectService.deleteProject(id);
	}

}
