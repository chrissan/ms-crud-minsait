package com.crudminsait.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Empleado")
@Getter
@Setter
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="curp")
    private String curp;

    @OneToOne
    @JoinColumn(name = "auto_id", referencedColumnName = "id")
    private Auto auto;
}
