package com.poshyweb.aluguelapp.dto;

import javax.persistence.Column;
import java.io.Serializable;

public class UsuarioDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String primeiroNome;
    private String ultimoNome;
    private String email;
    private String senha;
    private int tipoUsuarios;

    public UsuarioDto() {

    }

    public UsuarioDto(Long id, String primeiroNome, String ultimoNome, String email, String senha, int tipoUsuarios) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.email = email;
        this.senha = senha;
        this.tipoUsuarios = tipoUsuarios;
    }

    public UsuarioDto(UsuarioDto objUsuario) {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoUsuarios() {
        return tipoUsuarios;
    }

    public void setTipoUsuarios(int tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }

    @Override
    public String toString() {
        return "UsuarioDto{" + "id=" + id + ", primeiroNome='" + primeiroNome + '\'' + ", ultimoNome='" + ultimoNome + '\'' +
                ", email='" + email + '\'' + ", senha='" + senha + '\'' + ", tipoUsuarios=" + tipoUsuarios + '}';
    }
}
