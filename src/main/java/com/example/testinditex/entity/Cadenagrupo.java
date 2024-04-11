package com.example.testinditex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CADENAGRUPO")
/**
 * Clase CadenaGrupo correspondiente a la tabla análoga.
 */
public class Cadenagrupo {
    @Id
    @Column(name = "BRAND_ID", nullable = false)
    private Integer id;

    @Column(name = "NAME_BRAND", nullable = false)
    private String nameBrand;

}