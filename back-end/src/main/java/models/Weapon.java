package models;

import jakarta.persistence.*;

@Entity
@Table(name = "weapons")
public class Weapon extends Item {
    // FIXME: this needs to get updated based on route taken if ammo for it is going to be issued and tracked as well
    // TODO: (optional) Integrate ammo enums
    @Column
    private Boolean longGun;

    @Column
    private Boolean lethal;


}
