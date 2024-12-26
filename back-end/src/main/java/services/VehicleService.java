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

    //CRUD for vehicles

    public Vehicle getVehicleByID(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(Long id, Vehicle vehicleDetails) {
        return vehicleRepository.findById(id).map( vehicle -> {
            vehicle.setMake(vehicleDetails.getMake());
            vehicle.setModel(vehicleDetails.getModel());
            vehicle.setYear(vehicleDetails.getYear());
            vehicle.setLatestInspection(vehicleDetails.getLatestInspection());
            vehicle.setNextServiceInspection(vehicleDetails.getNextServiceInspection());
            vehicle.setAdditionalTrainingRequirements(vehicleDetails.isAdditionalTrainingRequirements());
            return vehicleRepository.save(vehicle);
                }
        ).orElse(null);
    }

    public boolean deleteVehicle(Long id) {
        if (vehicleRepository.existsById(id)) {
            vehicleRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


}
