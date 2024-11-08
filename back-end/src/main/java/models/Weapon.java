package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "weapons")
public class Weapon extends Item {

    @Column
    private Boolean longGun;

    @Column
    private Boolean lethal;

    
}
