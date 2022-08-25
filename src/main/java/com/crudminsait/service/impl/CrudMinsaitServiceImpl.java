package com.crudminsait.service.impl;

import com.crudminsait.entities.Auto;
import com.crudminsait.entities.Empleado;
import com.crudminsait.repository.IAutoRepository;
import com.crudminsait.service.ICrudminsaitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.crudminsait.repository.IEmpleadoRepository;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
public class CrudMinsaitServiceImpl implements ICrudminsaitService {

    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Autowired
    private IAutoRepository autoRepository;

    @Override
    public List<Empleado> listEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado getEmpleado(int idEmpleado) {
        Optional<Empleado> resultado = empleadoRepository.findById(idEmpleado);
        if (resultado.isPresent()){
            return resultado.get();
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Empleado no encontrado");
        }
    }

    @Override
    public Empleado createEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(int idEmpleado, Empleado empleado){
        Optional<Empleado> resultado = empleadoRepository.findById(idEmpleado);
        if (resultado.isPresent()){
            return empleadoRepository.save(empleado);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Empleado no encontrado");
        }
    }

    @Override
    public void deleteEmpleado(int idEmpleado){
        Optional<Empleado> resultado = empleadoRepository.findById(idEmpleado);
        if (resultado.isPresent()){
            empleadoRepository.deleteById(idEmpleado);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Empleado no encontrado");
        }
    }


    @Override
    public List<Auto> getAutos(){
        return autoRepository.findAll();
    }

    @Override
    public Auto createAuto(Auto auto){
        return autoRepository.saveAndFlush(auto);
    }
}
