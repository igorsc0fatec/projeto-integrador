package com.conect.projeto_integrador.repository;

import org.springframework.data.repository.CrudRepository;

import com.conect.projeto_integrador.model.Usuario;

public interface UsuarioDAO extends CrudRepository <Usuario, Long>{
    
}
