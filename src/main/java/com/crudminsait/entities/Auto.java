package com.crudminsait.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "Auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auto_id")
    @ApiModelProperty(value = "id del auto", example = "1")
    private int id;

    @Column(name = "marca")
    @ApiModelProperty(value = "marca del auto", example = "Ford")
    private String marca;

    @Column(name= "modelo")
    @ApiModelProperty(value = "modelo del auto", example = "455")
    private String modelo;

    @Column(name = "numeroSerie")
    @ApiModelProperty(value = "numero de serie del auto", example = "NSMWS153")
    private String numeroSerie;

    @ManyToOne()
    @JoinColumn(name="empleado_id")
    @JsonBackReference
    @ApiModelProperty(value = "Auto relacionados con el empleado")
    private Empleado empleado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
