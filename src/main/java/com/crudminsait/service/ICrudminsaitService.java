package com.crudminsait.service;

import com.crudminsait.entities.Auto;
import com.crudminsait.entities.Empleado;

import java.util.List;

public interface ICrudminsaitService {

    public List<Empleado> listEmpleados();

    Empleado getEmpleado(int idEmpleado);

    Empleado createEmpleado(Empleado empleado);

    Empleado updateEmpleado(int idEmpleado, Empleado empleado);

    void deleteEmpleado(int idEmpleado);

    List<Auto> getAutos();

    Auto createAuto(Auto auto);
}
