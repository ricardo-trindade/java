package com.studies.store.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.studies.store.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal preco;

    @Column(nullable = false)
    private Integer estoque;

    @NotNull
    private Status status;

    @NotNull @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataLancamento;


}
