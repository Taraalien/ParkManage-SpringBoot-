package com.prkmng.parkingmange.Controller;


import com.prkmng.parkingmange.Services.ParkingService;
import com.prkmng.parkingmange.tables.Parking;
import com.prkmng.parkingmange.tables.Vehicle;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.data.mongo.ReactiveStreamsMongoClientDependsOnBeanFactoryPostProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("park_car1")
public class ParkingController {

    private final ParkingService parkingService;


    @PostMapping("/park1")
    public ResponseEntity save(@RequestBody Parking park1){

        parkingService.save(park1);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/park1")
    public ResponseEntity<List<Parking>>getall(){

        List<Parking>parkingList=parkingService.GetAll();
        return ResponseEntity.ok(parkingList);
    }

    @PutMapping("park1")
    public ResponseEntity update(@RequestBody Parking park1){
        parkingService.save(park1);
        return ResponseEntity.ok().build();
    }

    @PutMapping("park1")
    public ResponseEntity<Long> total(@RequestBody Date o, @RequestBody Date e ,@RequestBody Long p){
        parkingService.Total(o,e,p);
        return ResponseEntity.ok().build();
    }

}
