
package com.example.argentinaprograma.proyectofinal.controller;

import com.example.argentinaprograma.proyectofinal.model.Project;
import com.example.argentinaprograma.proyectofinal.service.ProjectService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://argentinaprograma-58a08.web.app")
@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    
    @GetMapping("/traer")
    public List<Project> getProjects(){
        return projectService.traer();
    }
    
    @GetMapping("/traer/{id}")
    public Project getOneProject(@PathVariable Long id){
        return projectService.traerUno(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/guardar")
    public void createProject(@RequestBody Project project){
        projectService.guardar(project);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteProject(@PathVariable Long id){
        projectService.borrar(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Project editProject(@PathVariable Long id,
                              @RequestBody Project proj){
        
        Project project = projectService.traerUno(id);
        
        project.setNombre_proyecto(proj.getNombre_proyecto());
        project.setDescripcion(proj.getDescripcion());
        project.setLink(proj.getLink()); 
        
        if(proj.getImg() != null){
            project.setImg(proj.getImg());
        }
            
        projectService.guardar(project);
        
        return project; 
    }
}
