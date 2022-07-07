
package com.example.argentinaprograma.proyectofinal.repository;

import com.example.argentinaprograma.proyectofinal.model.Education;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long>{
    
}
