
package com.example.argentinaprograma.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Profile {
    @Id
    private Long id;   
    private String nombre_completo;
    private String fecha_nacimiento;
    private String ocupacion;
    private String localidad;
    private String image_background_header;
    private String image_perfil;
}
