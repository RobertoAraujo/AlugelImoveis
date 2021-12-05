package com.poshyweb.aluguelapp.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UsuarioDto {

    private Long id;
    private String primeiroNome;
    private String ultimoNome;
    private String email;
    private int tipoUsuarios;

    public UsuarioDto(UsuarioDto objUsuario) {

    }

    public UsuarioDto(Long id, String primeiroNome, String ultimoNome, String email, int tipoUsuarios) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.email = email;
        this.tipoUsuarios = tipoUsuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoUsuarios() {
        return tipoUsuarios;
    }

    public void setTipoUsuarios(int tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }
}
