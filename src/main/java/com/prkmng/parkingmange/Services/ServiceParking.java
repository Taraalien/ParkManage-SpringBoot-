package com.prkmng.parkingmange.Services;

import com.prkmng.parkingmange.tables.Parking;
import com.prkmng.parkingmange.tables.ParkingRepository;
import com.prkmng.parkingmange.tables.Vehicle;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceParking implements ParkingService{
    private final ParkingRepository parkingRepository;


    @Override
    public Parking save(Parking park) {
        return null;
    }

    @Override
    public Parking update(Parking park) {
        Parking park1=getById(park.getId());
        park1.setEnterTime(park1.getEnterTime());
        park1.setOutTime(park1.getOutTime());
        return parkingRepository.save(park1);
    }

    @Override
    public Parking getById(Long id) {
     Optional<Parking> optionalParking=parkingRepository.findById(id);
        if(!optionalParking.isPresent()){throw  new RuntimeException("NOt Found");}
        return optionalParking.get();
    }

    @Override
    public List<Parking> GetAll() {
        return (List<Parking>) parkingRepository.findAll();
    }

    @Override
    public Parking toLongEnter(Parking park) {
        return parkingRepository.save(park);
    }

    @Override
    public Parking toLongOut(Parking park) {
        return parkingRepository.save(park);
    }

    @Override
    public Long Total(Date e, Date o, Long price) {
        Long result=(o.getTime()-e.getTime()) * price;
        return result.longValue();
    }

    @Override
    public void delete(Long id) {
        parkingRepository.deleteById(id);

    }


}
