package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Project;
import com.example.argentinaprograma.proyectofinal.repository.ProjectRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService{
    @Autowired
    ProjectRepository projectsRepository;

    @Override
    public List<Project> traer() {
        return projectsRepository.findAll();
    }

    @Override
    public Project traerUno(Long id) {
        return projectsRepository.findById(id).orElse(null);
    }

    @Override
    public void guardar(Project proj) {
        projectsRepository.save(proj);
    }

    @Override
    public void borrar(Long id) {
        projectsRepository.deleteById(id);
    }
    
}
