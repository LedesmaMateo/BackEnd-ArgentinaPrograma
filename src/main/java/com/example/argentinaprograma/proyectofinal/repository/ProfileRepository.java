
package com.example.argentinaprograma.proyectofinal.repository;

import com.example.argentinaprograma.proyectofinal.model.Profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>{
    
}
