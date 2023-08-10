package com.example.lembrete.lembrete.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "Pessoa",schema = "public")
public class Pessoa extends AbstractEntity {
    @Column(name = "Nome",nullable = false,length = 30)
    private String Nome;
}
