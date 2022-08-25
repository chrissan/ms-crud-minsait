package com.crudminsait.controller;

import com.crudminsait.entities.Auto;
import com.crudminsait.entities.Empleado;
import com.crudminsait.service.ICrudminsaitService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/minsait")
public class CrudminsaitController {
    @Autowired
    private ICrudminsaitService service;

    @GetMapping("/empleados")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 412, message = "Precondition Failed"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @ApiOperation("Operación que obtiene una lista de los empleados")
    public ResponseEntity<List<Empleado>> listEmpleados(){
        return new ResponseEntity<List<Empleado>>(service.listEmpleados(), HttpStatus.OK);
    }


    @PostMapping("/empleado/nuevo")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Empleado.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 412, message = "Precondition Failed"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @ApiOperation("Operación que crea un empleado")
    public ResponseEntity<Empleado> createEmpleados(@RequestBody Empleado body){
        return new ResponseEntity<Empleado>(service.createEmpleado(body), HttpStatus.CREATED);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<Empleado> getEmpleados(@PathVariable("id") int idempleado){
        return new ResponseEntity<Empleado>(service.getEmpleado(idempleado), HttpStatus.OK);
    }

    @DeleteMapping("/empleado/{id}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Empleado.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 412, message = "Precondition Failed"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @ApiOperation("Operación que elimina a un empleado")
    public ResponseEntity<Empleado> deleteEmpleados(@PathVariable("id") int idempleado){
        service.deleteEmpleado(idempleado);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/empleado/{id}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Empleado.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 412, message = "Precondition Failed"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @ApiOperation("Operación que actualiza a un empleado")
    public ResponseEntity<Empleado> updateEmpleados(@PathVariable("id") int idempleado, @RequestBody Empleado body){
        return new ResponseEntity<Empleado>(service.updateEmpleado(idempleado, body), HttpStatus.OK);
    }


    @GetMapping("/autos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 412, message = "Precondition Failed"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @ApiOperation("Operación que obitene una lista de los autos")
    public ResponseEntity<List<Auto>> getAutos(){
        return new ResponseEntity<List<Auto>>(service.getAutos(), HttpStatus.OK);
    }

    @PostMapping("/auto/nuevo")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Auto.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 412, message = "Precondition Failed"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @ApiOperation("Operación que crea un auto")
    public ResponseEntity<Auto> createAutos(@RequestBody Auto body) {
        return new ResponseEntity<Auto>(service.createAuto(body), HttpStatus.CREATED);
    }
}
