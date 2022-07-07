package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Profile;
import com.example.argentinaprograma.proyectofinal.repository.ProfileRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements IProfileService{
    
    @Autowired
    ProfileRepository repositoryProfile;
    
    @Override
    public List<Profile> traer() {
        return repositoryProfile.findAll();
    }

    @Override
    public Profile traerUno(Long id) {
        return repositoryProfile.findById(id).orElse(null);
    }

    @Override
    public void guardar(Profile prof) {
        repositoryProfile.save(prof);
    }
    
}
