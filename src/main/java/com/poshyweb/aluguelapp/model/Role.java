package com.poshyweb.aluguelapp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
public class Role implements Serializable {
    static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String roleNome;

    public Role() {
    }

    public Role(Long id, String roleNome) {
        this.id = id;
        this.roleNome = roleNome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleNome() {
        return roleNome;
    }

    public void setRoleNome(String roleNome) {
        this.roleNome = roleNome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return Objects.equals(getId(), role.getId()) && getRoleNome().equals(role.getRoleNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRoleNome());
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleNome='" + roleNome + '\'' +
                '}';
    }
}
