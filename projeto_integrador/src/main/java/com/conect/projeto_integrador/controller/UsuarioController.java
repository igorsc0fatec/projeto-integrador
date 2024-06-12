package com.conect.projeto_integrador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.conect.projeto_integrador.model.Usuario;
import com.conect.projeto_integrador.service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return (List<Usuario>) usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
        Optional<Usuario> usuario = usuarioService.findById(id);
        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetails) {
        Optional<Usuario> usuario = usuarioService.findById(id);
        if (usuario.isPresent()) {
            Usuario existingUsuario = usuario.get();

            existingUsuario.setEmailUsuario(usuarioDetails.getEmailUsuario());
            existingUsuario.setEmailVerificado(usuarioDetails.isEmailVerificado());
            existingUsuario.setContaAtiva(usuarioDetails.isContaAtiva());
            existingUsuario.setSenhaUsuario(usuarioDetails.getSenhaUsuario());
            existingUsuario.setOnline(usuarioDetails.isOnline());
            existingUsuario.setIdTipoUsuario(usuarioDetails.getIdTipoUsuario());

            return ResponseEntity.ok(usuarioService.save(existingUsuario));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        Optional<Usuario> usuario = usuarioService.findById(id);
        if (usuario.isPresent()) {
            usuarioService.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
