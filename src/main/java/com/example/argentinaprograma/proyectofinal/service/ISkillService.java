
package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> traer();
    
    public void guardar(Skill skill);
}
