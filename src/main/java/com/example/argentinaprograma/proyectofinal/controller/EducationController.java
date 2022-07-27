
package com.example.argentinaprograma.proyectofinal.controller;

import com.example.argentinaprograma.proyectofinal.model.Education;
import com.example.argentinaprograma.proyectofinal.service.EducationService;

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

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://argentinaprograma-58a08.web.app"})
@RequestMapping("/api/education")
public class EducationController {
    @Autowired
    private EducationService educationService;

    @GetMapping("/traer")
    public List<Education> getEduc() {
        return educationService.traer();
    }

    @GetMapping("/traer/{id}")
    public Education getOneEduc(@PathVariable Long id) {
        return educationService.traerUno(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/guardar")
    public void createEduc(@RequestBody Education educ) {
        educationService.guardar(educ);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarEduc(@PathVariable Long id) {
        educationService.eliminar(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Education editarEduc(@PathVariable Long id,
                                @RequestBody Education educ) {

        Education education = educationService.traerUno(id);

        education.setEscuela(educ.getEscuela());
        education.setEstado(educ.getEstado());
        education.setInicio(educ.getInicio());
        education.setFin(educ.getFin());
        education.setTitulo(educ.getTitulo());
        education.setDescripcion(educ.getDescripcion());

        if (educ.getImg() != null) {
            education.setImg(educ.getImg());
        }

        educationService.guardar(education);

        return education;
    }
}
