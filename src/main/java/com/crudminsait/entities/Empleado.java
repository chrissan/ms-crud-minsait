package com.crudminsait.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empleado")

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empleado_id")
    @ApiModelProperty(value = "id", example = "1")
    private int id;

    @Column(name="nombre")
    @ApiModelProperty(value = "Nombre del empleado", example = "Christian")
    private String nombre;

    @Column(name="apellido")
    @ApiModelProperty(value = "Apellido del empleado", example = "Sánchez")
    private String apellido;

    @Column(name="curp")
    @ApiModelProperty(value = "Curp del empleado", example = "SAOC910118")
    private String curp;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado")
    @ApiModelProperty(value = "Autos usados por el empleado")
    private List<Auto> autos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public List<Auto> getAuto() {
        return autos;
    }

    public void setAuto(List<Auto> auto) {
        this.autos = auto;
    }
}
