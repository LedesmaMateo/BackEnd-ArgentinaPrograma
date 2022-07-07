package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Education;

import java.util.List;

public interface IEducationService {
    public List<Education> traer();
    
    public Education traerUno(Long id);

    public void guardar(Education educ);
    
    public void eliminar(Long id);
}
