package com.poshyweb.aluguelapp.model;


import java.io.Serializable;
import java.util.Objects;

public class Definicao implements Serializable {
    /**
     * Roberto A Moraes
     * https://github.com/RobertoAraujo
     * 06/12/2021
     */
    private static final long serialVersionUID = 1L;

    private Long id;
    private String primeiroNome;
    private String ultimoNome;
    private String email;
    private String senha;

    public Definicao() {

    }

    public Definicao(Long id, String primeiroNome, String ultimoNome, String email, String senha) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.email = email;
        this.senha = senha;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Definicao)) return false;
        Definicao definicao = (Definicao) o;
        return Objects.equals(getId(), definicao.getId()) && Objects.equals(getPrimeiroNome(), definicao.getPrimeiroNome()) && Objects.equals(getUltimoNome(), definicao.getUltimoNome()) && Objects.equals(getEmail(), definicao.getEmail()) && Objects.equals(getSenha(), definicao.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPrimeiroNome(), getUltimoNome(), getEmail(), getSenha());
    }

    @Override
    public String toString() {
        return "Definicao{" + "id=" + id + ", primeiroNome='" + primeiroNome + '\'' + ", ultimoNome='" + ultimoNome
                + '\'' + ", email='" + email + '\'' + ", senha='" + senha + '\'' + '}';
    }
}
