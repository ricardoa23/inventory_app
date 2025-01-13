package repository;

import models.LethalAmmunition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LethalAmmoRepository extends JpaRepository<LethalAmmunition, Long> {
}
