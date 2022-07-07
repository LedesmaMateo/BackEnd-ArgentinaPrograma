package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Education;
import com.example.argentinaprograma.proyectofinal.repository.EducationRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    EducationRepository educationRepository;

    @Override
    public List<Education> traer() {
        return educationRepository.findAll();
    }

    @Override
    public Education traerUno(Long id) {
        return educationRepository.findById(id).orElse(null);
    }

    @Override
    public void guardar(Education educ) {
        educationRepository.save(educ);
    }

    @Override
    public void eliminar(Long id) {
        educationRepository.deleteById(id);
    }
    
}
