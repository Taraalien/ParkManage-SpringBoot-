package com.prkmng.parkingmange.Services;

import com.prkmng.parkingmange.tables.Parking;
import com.prkmng.parkingmange.tables.Vehicle;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface ParkingService {
    Parking save(Parking park);
    Parking update(Parking park);
    Parking getById(Long id);
    List<Parking> GetAll();
    Parking toLongEnter(Parking park);
    Parking toLongOut(Parking park);
    Long Total(Date e,Date o,Long price);
    void delete(Long id);
}
