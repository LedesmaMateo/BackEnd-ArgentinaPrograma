
package com.example.argentinaprograma.proyectofinal.controller;

import com.example.argentinaprograma.proyectofinal.model.Skill;
import com.example.argentinaprograma.proyectofinal.service.SkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = {"http://localhost:4200", "https://argentinaprograma-58a08.web.app"})
@RestController
@RequestMapping("/api/skill")
public class SkillController {
    @Autowired
    private SkillService skillService;
    
    @GetMapping("/traer")
    public List<Skill> traer(){
        return skillService.traer();
    }
    
    @PostMapping("/guardar")
    public void guardar(@RequestBody Skill skill){
        skillService.guardar(skill);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable Long id){
        skillService.borrar(id);
    }
}
