
package com.example.argentinaprograma.proyectofinal.controller;

import com.example.argentinaprograma.proyectofinal.model.Profile;
import com.example.argentinaprograma.proyectofinal.service.ProfileService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://argentinaprograma-58a08.web.app"})
@RequestMapping("/api/profile")
public class ProfileController {
    @Autowired
    private ProfileService profileService;
    
    @GetMapping("/traer")
    public List<Profile> getProfile(){
        return profileService.traer();
    }
    
    @GetMapping("/traer/{id}")
    public Profile getOneProfile(@PathVariable Long id){
        return profileService.traerUno(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/guardar")
    public void createProfile(@RequestBody Profile prof){
        profileService.guardar(prof);
    }     
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Profile editProfile(@PathVariable Long id,
                               @RequestBody Profile prof){
        
        Profile profile = profileService.traerUno(id);
        
        profile.setNombre_completo(prof.getNombre_completo());
        profile.setFecha_nacimiento(prof.getFecha_nacimiento());
        profile.setLocalidad(prof.getLocalidad());
        profile.setOcupacion(prof.getOcupacion());
        
        if(prof.getImage_background_header() != null){
            profile.setImage_background_header(prof.getImage_background_header());
        }
        
        if(prof.getImage_perfil() != null){
            profile.setImage_perfil(prof.getImage_perfil());
        }
        
        profileService.guardar(profile);
        
        return profile;
        
    }
}
