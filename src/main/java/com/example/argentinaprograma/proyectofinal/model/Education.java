
package com.example.argentinaprograma.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Education {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String escuela;
    private String descripcion;
    private String titulo;
    private String img;
    private String inicio;
    private String fin;
    private String estado;
}
