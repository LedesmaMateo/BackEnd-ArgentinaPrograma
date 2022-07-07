
package com.example.argentinaprograma.proyectofinal.repository;

import com.example.argentinaprograma.proyectofinal.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{
    
}
