
package com.example.argentinaprograma.proyectofinal.service;

import com.example.argentinaprograma.proyectofinal.model.Skill;
import com.example.argentinaprograma.proyectofinal.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    @Autowired
    SkillRepository skillRepository;
    
    @Override
    public List<Skill> traer() {
        return skillRepository.findAll();
    }

    @Override
    public void guardar(Skill skill) {
        skillRepository.save(skill);
    }
    
}
