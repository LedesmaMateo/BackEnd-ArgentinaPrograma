
package com.example.argentinaprograma.proyectofinal.controller;

import com.example.argentinaprograma.proyectofinal.model.Experience;
import com.example.argentinaprograma.proyectofinal.service.ExperienceService;

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

@CrossOrigin(origins = {"http://localhost:4200", "https://argentinaprograma-58a08.web.app"})
@RestController
@RequestMapping("/api/experience")
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;
    
    @GetMapping("/traer")
    public List<Experience> getExp(){
        return experienceService.traer();
    }
    
    @GetMapping("/traer/{id}")
    public Experience getOneExp(@PathVariable Long id){
        return experienceService.traerUno(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/guardar")
    public void createExp(@RequestBody Experience expe){
        experienceService.guardar(expe);
    }

    @PreAuthorize("hasRole('ADMIN')")    
    @DeleteMapping("/borrar/{id}")
    public void deleteExp(@PathVariable Long id){
        experienceService.borrar(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Experience editExp(@PathVariable Long id,
                              @RequestBody Experience expe){
        
        Experience experience = experienceService.traerUno(id);
        
        experience.setNombre_puesto(expe.getNombre_puesto());
        experience.setDescripcion(expe.getDescripcion());
        experience.setInicio(expe.getInicio());
        experience.setFin(expe.getFin());
        
        if(expe.getLogo() != null){
            experience.setLogo(expe.getLogo());
        }
          
        experienceService.guardar(experience);
        
        return experience;
    }
    
}
