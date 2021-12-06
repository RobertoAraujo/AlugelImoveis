package com.poshyweb.aluguelapp.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Roberto A Moraes
 * https://github.com/RobertoAraujo
 * 06/12/2021
 */
@Entity
@Table(name = "quarto")
public class Quarto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private int comodos;
	@Column
	private String descricao;
	@Column
//	private  Disponibilidade disponibilidade;
	private String disponibilidade;
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
//	public Disponibilidade getDisponibilidade() {
//		return disponibilidade;
//	}
//	public void setDisponibilidade(Disponibilidade disponibilidade) {
//		this.disponibilidade = disponibilidade;
//	}
	public String getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(comodos, descricao, disponibilidade, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quarto other = (Quarto) obj;
		return comodos == other.comodos && Objects.equals(descricao, other.descricao)
				&& Objects.equals(disponibilidade, other.disponibilidade) && Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Quarto [id=" + id + ", comodos=" + comodos + ", descricao=" + descricao + ", disponibilidade="
				+ disponibilidade + "]";
	}
	
	
	

}
