package services;

import models.Supervisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SupervisorRepository;

@Service
public class SupervisorService extends BaseService<Supervisor, Long> {

    private final SupervisorRepository supervisorRepository;

    @Autowired
    public SupervisorService(SupervisorRepository supervisorRepository) { this.supervisorRepository = supervisorRepository; }

    @Override
    protected SupervisorRepository getRepository() { return supervisorRepository; }

    @Override
    protected Supervisor updateEntity(Supervisor existingVehicle, Supervisor supervisorDetails) {
        existingVehicle.setApprovalLimit(supervisorDetails.getApprovalLimit());
        existingVehicle.setAuthorizationLevel(supervisorDetails.getAuthorizationLevel());
        existingVehicle.setCertifications(supervisorDetails.getCertifications());
        existingVehicle.setSubordinates(supervisorDetails.getSubordinates());
    }
}
