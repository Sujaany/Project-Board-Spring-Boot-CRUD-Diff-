package com.example.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectRepository projectRepository;
	
	@Override
	public boolean addProject(Project project) {
		if (project != null) {
			projectRepository.save(project);
			return true;
		}
		return false;
	}

	@Override
	public List<Project> viewProject() {
		return projectRepository.findAll();
	}

	@Override
	public boolean deleteProject(Long id) {
		if (projectRepository.getOne(id)!= null) {
			projectRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateProject(Long id, Project project) {
		Project existBook = projectRepository.getOne(id);
		if(existBook.getId()!=null) {

		project.setId(id);
		projectRepository.save(project);
		}
		return true;
	}

}
