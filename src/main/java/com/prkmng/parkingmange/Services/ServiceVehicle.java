package com.prkmng.parkingmange.Services;

import com.prkmng.parkingmange.tables.Vehicle;
import com.prkmng.parkingmange.tables.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceVehicle implements VehicleService{
    private final VehicleRepository vehicleRepository;

    @Override
    public Vehicle save(Vehicle car) {
        return vehicleRepository.save(car);
    }

    @Override
    public Vehicle update(Vehicle car) {
        Vehicle car1 =getById(car.getId());
        car1.setCarTag(car1.getCarTag());
        car1.setCarType(car1.getCarType());
        return vehicleRepository.save(car1);
    }

    @Override
    public Vehicle getById(Long id) {
        Optional<Vehicle> optionalVehicle=vehicleRepository.findById(id);
        if(!optionalVehicle.isPresent()){throw  new RuntimeException("NOt Found");}
        return optionalVehicle.get();
    }


    @Override
    public List<Vehicle> GetAll() {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

}
