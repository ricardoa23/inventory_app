package services;

import models.LethalAmmunition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LethalAmmoRepository;

@Service
public class LethalAmmoService extends BaseService<LethalAmmunition, Long> {

    private final LethalAmmoRepository lethalAmmoRepository;

    @Autowired
    public LethalAmmoService(LethalAmmoRepository lethalAmmoRepository) { this.lethalAmmoRepository = lethalAmmoRepository; }

    @Override
    public LethalAmmoRepository getRepository() { return lethalAmmoRepository; }

    @Override
    protected LethalAmmunition updateEntity(LethalAmmunition existingEntity, LethalAmmunition entityDetails) {
        existingEntity.setCaliber(entityDetails.getCaliber());
        existingEntity.setDescription((entityDetails.getDescription()));
        existingEntity.setQuantityInStock(entityDetails.getQuantityInStock());
        return existingEntity;
    }
}
