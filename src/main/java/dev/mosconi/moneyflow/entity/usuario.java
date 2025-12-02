package dev.mosconi.moneyflow.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private Integer idade;

    @Column(name = "data_criacao")
    private String dataCriacao;

    //Getters and Setters
    public Long getId(){
        return id;
    }

}

