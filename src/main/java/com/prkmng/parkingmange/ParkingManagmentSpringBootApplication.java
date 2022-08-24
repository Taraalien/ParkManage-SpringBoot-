package com.prkmng.parkingmange;

import com.prkmng.parkingmange.Services.ParkingService;
import com.prkmng.parkingmange.Services.VehicleService;
import com.prkmng.parkingmange.tables.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class ParkingManagmentSpringBootApplication implements ApplicationRunner {

    private final VehicleRepository repository;
    private  final ParkingRepository parkingRepository;

    @Autowired
    VehicleService vehicleService;
    @Autowired
    ParkingService parkingService;

    public static void main(String[] args) {

        SpringApplication.run(ParkingManagmentSpringBootApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(repository.count()==0 & parkingRepository.count()==0) {

            Vehicle car1 = new Vehicle();
            car1.setCarTag("25j65-10");
            car1.setCarType(CarType.TEJARI);
            Vehicle carSaved=repository.save(car1);
            Parking park1=new Parking();
            park1.setEnterTime(park1.getEnterTime());
            park1.setOutTime(park1.getOutTime());
            Parking savepark=parkingRepository.save(park1);
        }




        List<Vehicle>vehicleList=(List<Vehicle>)repository.findAll();
        List<Parking>parkings=(List<Parking>)parkingRepository.findAll();
       List<Vehicle>allv= vehicleService.GetAll();
        List<Parking>allp =parkingService.GetAll();

        }
}

