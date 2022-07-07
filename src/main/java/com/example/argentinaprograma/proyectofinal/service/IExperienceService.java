package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Experience;

import java.util.List;

public interface IExperienceService {
    public List<Experience> traer();
    
    public Experience traerUno(Long id);
    
    public void guardar(Experience expe);
    
    public void borrar(Long id);
}
