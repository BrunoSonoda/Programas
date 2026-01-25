package com.projeto.sistema.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.sistema.modelos.Estado;

public interface EstadoRepositorio extends JpaRepository<Estado, Long> {

}
