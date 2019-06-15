package com.example.project;

import java.util.List;

public interface ProjectService {
	boolean addProject(Project project);
	List<Project> viewProject();
	boolean deleteProject(Long id);
	boolean updateProject(Long id,Project project);

}
