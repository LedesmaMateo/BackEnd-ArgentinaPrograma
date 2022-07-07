
package com.example.argentinaprograma.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre_proyecto;
    private String descripcion;
    private String img;
    private String link;
}
