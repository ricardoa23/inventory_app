package services;

import models.NonLethalAmmunition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.NonLethalAmmoRepository;

@Service
public class NonLethalAmmoService extends BaseService<NonLethalAmmunition, Long> {

    private final NonLethalAmmoRepository nonLethalAmmoRepository;

    @Autowired
    public NonLethalAmmoService(NonLethalAmmoRepository nonLethalAmmoRepository) { this.nonLethalAmmoRepository = nonLethalAmmoRepository; }

    @Override
    public NonLethalAmmoRepository getRepository() { return nonLethalAmmoRepository; }

    @Override
    protected NonLethalAmmunition updateEntity(NonLethalAmmunition existingEntity, NonLethalAmmunition entityDetails) {
        existingEntity.setCategory(entityDetails.getCategory());
        existingEntity.setDescription(entityDetails.getDescription());
        existingEntity.setQuantityInStock(entityDetails.getQuantityInStock());
        return existingEntity;
    }
}
