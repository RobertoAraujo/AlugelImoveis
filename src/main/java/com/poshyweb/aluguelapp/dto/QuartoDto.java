package com.poshyweb.aluguelapp.dto;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class QuartoDto implements Serializable {
    /***
     * Roberto A Moraes
     */
    private static final long serialVersionUID = 1L;

    private Long id;
    private int comodos;
    private String descricao;

    public QuartoDto() {
    }

    public QuartoDto(Long id, int comodos, String descricao) {
        this.id = id;
        this.comodos = comodos;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getComodos() {
        return comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuartoDto)) return false;
        QuartoDto quartoDto = (QuartoDto) o;
        return getComodos() == quartoDto.getComodos() && getId().equals(quartoDto.getId()) && getDescricao().equals(quartoDto.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getComodos(), getDescricao());
    }

    @Override
    public String toString() {
        return "QuartoDto{" +
                "id=" + id +
                ", comodos=" + comodos +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
