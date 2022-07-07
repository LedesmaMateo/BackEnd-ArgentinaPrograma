
package com.example.argentinaprograma.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Experience {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre_puesto;
    private String descripcion;
    private String inicio;
    private String fin;
    private String logo;
}
