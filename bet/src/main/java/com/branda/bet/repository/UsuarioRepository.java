package com.branda.bet.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.branda.bet.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

}
