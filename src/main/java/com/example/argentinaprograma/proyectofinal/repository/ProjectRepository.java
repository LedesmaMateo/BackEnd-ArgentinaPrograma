
package com.example.argentinaprograma.proyectofinal.repository;

import com.example.argentinaprograma.proyectofinal.model.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
    
}
