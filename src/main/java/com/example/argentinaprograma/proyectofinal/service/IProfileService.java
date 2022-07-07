
package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Profile;

import java.util.List;

public interface IProfileService {
    public List<Profile> traer();
    
    public Profile traerUno(Long id);
    
    public void guardar(Profile prof);
}
