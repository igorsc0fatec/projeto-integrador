package com.conect.projeto_integrador.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;

    @Column(name = "emailUsuario")
    private String emailUsuario;

    @Column(name = "emailVerificado")
    private boolean emailVerificado;

    @Column(name = "contaAtiva")
    private boolean contaAtiva;

    @Column(name = "senhaUsuario")
    private String senhaUsuario;

    @Column(name = "dataCriacao")
    private LocalDateTime  dataCriacao;

    @Column(name = "online")
    private LocalDateTime  online;

    @Column(name = "idTipoUsuario")
    private int idTipoUsuario;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public boolean isEmailVerificado() {
        return emailVerificado;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public LocalDateTime  getDataCriacao() {
        return dataCriacao;
    }

    public LocalDateTime  isOnline() {
        return online;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void setEmailVerificado(boolean emailVerificado) {
        this.emailVerificado = emailVerificado;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public void setDataCriacao(LocalDateTime  dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setOnline(LocalDateTime  online) {
        this.online = online;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
}
