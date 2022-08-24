package com.prkmng.parkingmange.Services;

import com.prkmng.parkingmange.tables.Parking;
import com.prkmng.parkingmange.tables.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle save(Vehicle car);
    Vehicle update(Vehicle car);
    Vehicle getById(Long id);
     List<Vehicle> GetAll();
}
