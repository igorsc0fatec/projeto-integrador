package com.conect.projeto_integrador.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conect.projeto_integrador.model.Usuario;
import com.conect.projeto_integrador.repository.UsuarioDAO;

@Service
public class UsuarioService implements UsuarioDAO{

    @Autowired
    private UsuarioDAO usuarioDao;

    @Override
    public long count() {
        return usuarioDao.count();
    }

    @Override
    public void delete(Usuario entity) {
        usuarioDao.delete(entity);
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll(Iterable<? extends Usuario> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteById(Long id) {
        usuarioDao.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public Iterable<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    public Iterable<Usuario> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioDao.findById(id);
    }

    @Override
    public <S extends Usuario> S save(S entity) {
        if (entity.getIdUsuario() == 0) { // Novo usuário
            entity.setDataCriacao(LocalDateTime.now());
        }
        entity.setOnline(LocalDateTime.now());
        return usuarioDao.save(entity);
    }

    @Override
    public <S extends Usuario> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }
    
}
