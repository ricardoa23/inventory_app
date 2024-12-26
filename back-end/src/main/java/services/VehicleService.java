package services;

import models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.VehicleRepository;

import java.util.List;

@Service
public class VehicleService {
private final VehicleRepository vehicleRepository;

@Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
    this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicles() {
    return vehicleRepository.findAll();
    }

    public Vehicle getVehicleByID(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        return vehicleRepository.findById(id).map(
                // TODO: Once the model is complete come back and set up this map
        ).orElse(null)
    }


}
