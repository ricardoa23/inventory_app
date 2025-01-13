package repository;

import models.NonLethalAmmunition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonLethalAmmoRepository extends JpaRepository<NonLethalAmmunition, Long> {
}
