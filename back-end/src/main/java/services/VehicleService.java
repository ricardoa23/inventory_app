package services;

import models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.VehicleRepository;

@Service
public class VehicleService extends BaseService<Vehicle, Long> {

    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService (VehicleRepository vehicleRepository) {
        this.vehicleRepository =  vehicleRepository;
    }

    @Override
    protected VehicleRepository getRepository() {
        return vehicleRepository;
    }

    @Override
    protected  Vehicle updateEntity(Vehicle existingVehicle, Vehicle vehicleDetails) {
        existingVehicle.setMake(vehicleDetails.getMake());
        existingVehicle.setModel(vehicleDetails.getModel());
        existingVehicle.setYear(vehicleDetails.getYear());
        existingVehicle.setLatestInspection(vehicleDetails.getLatestInspection());
        existingVehicle.setNextServiceInspection(vehicleDetails.getNextServiceInspection());
        existingVehicle.setAdditionalTrainingRequirements(vehicleDetails.isAdditionalTrainingRequirements());
        return existingVehicle;
    }
}