package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Experience;
import com.example.argentinaprograma.proyectofinal.repository.ExperienceRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{
    
    @Autowired
    ExperienceRepository experienceRepository;

    @Override
    public List<Experience> traer() {
        return experienceRepository.findAll();
    }

    @Override
    public Experience traerUno(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    @Override
    public void guardar(Experience expe) {
        experienceRepository.save(expe);
    }

    @Override
    public void borrar(Long id) {
        experienceRepository.deleteById(id);
    }
    
}
