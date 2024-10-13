package com.example.secure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

//add lombok annotations
@Setter
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "role_id")
    private Integer roleId;
    private String authority;

    public Role(String authority){
        this.authority = authority;
    }
    @Override
    public String getAuthority() {
        return this.authority;
    }
}
