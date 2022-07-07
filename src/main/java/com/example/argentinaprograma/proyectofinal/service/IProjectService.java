
package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Project;

import java.util.List;

public interface IProjectService {
    public List<Project> traer();
    
    public Project traerUno(Long id);
    
    public void guardar(Project proj);
    
    public void borrar(Long id);
}
