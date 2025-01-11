package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "lethalAmmo")
public class LethalAmmunition extends AmmunitionBase {
    private String caliber;

    public LethalAmmunition() {
    }

    public LethalAmmunition(String caliber) {
        this.caliber = caliber;
    }

    public LethalAmmunition(Long id, String description, int quantityInStock, String caliber) {
        super(id, description, quantityInStock);
        this.caliber = caliber;
    }

    public LethalAmmunition(String description, int quantityInStock, String caliber) {
        super(description, quantityInStock);
        this.caliber = caliber;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }
}
