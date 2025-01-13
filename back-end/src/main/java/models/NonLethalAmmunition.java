package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Nonlethal_Ammo")
public class NonLethalAmmunition extends AmmunitionBase{
    private String category;

    public NonLethalAmmunition() {
    }

    public NonLethalAmmunition(String category) {
        this.category = category;
    }

    public NonLethalAmmunition(Long id, String description, int quantityInStock, String category) {
        super(id, description, quantityInStock);
        this.category = category;
    }

    public NonLethalAmmunition(String description, int quantityInStock, String category) {
        super(description, quantityInStock);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
