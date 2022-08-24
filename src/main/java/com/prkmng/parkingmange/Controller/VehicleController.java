package com.prkmng.parkingmange.Controller;


import com.prkmng.parkingmange.Services.VehicleService;
import com.prkmng.parkingmange.tables.Vehicle;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "vehicle")
@AllArgsConstructor
public class VehicleController {

    private final VehicleService service;

    @PostMapping("/car1")
    public ResponseEntity save(@RequestBody Vehicle car){

        service.save(car);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/car1")
    public ResponseEntity<List<Vehicle>>getall(){

        List<Vehicle>vehicleList=service.GetAll();
        return ResponseEntity.ok(vehicleList);
    }

    @PutMapping("car1")
    public ResponseEntity update(@RequestBody Vehicle car1){
        service.save(car1);
        return ResponseEntity.ok().build();
    }

}
