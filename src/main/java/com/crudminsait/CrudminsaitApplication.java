package com.crudminsait;

import com.crudminsait.entities.Auto;
import com.crudminsait.entities.Empleado;
import com.crudminsait.service.ICrudminsaitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudminsaitApplication implements ApplicationRunner {

    @Autowired
    ICrudminsaitService service;

    public static void main(String[] args) {
        SpringApplication.run(CrudminsaitApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Empleado empleado = new Empleado();
        empleado.setNombre("Christian");
        empleado.setApellido("Sanchez");
        empleado.setCurp("SAOC910118");

        Empleado empleado1 = service.createEmpleado(empleado);

        Auto auto = new Auto();
        auto.setMarca("FORD");
        auto.setModelo("500");
        auto.setNumeroSerie("NEMSAPC");
        auto.setEmpleado(empleado1);
        service.createAuto(auto);
    }
}
