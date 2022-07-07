
package com.example.argentinaprograma.proyectofinal.repository;

import com.example.argentinaprograma.proyectofinal.model.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long>{
    public Optional<Usuario> findByUsernameOrEmail(String username, String email);
}
