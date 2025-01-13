package models;

import enums.checkoutStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "weapons")
public class Weapon extends Item {
    // FIXME: this needs to get updated based on route taken if ammo for it is going to be issued and tracked as well
    // TODO: Add a certification for checkout users have to certified in order to checkout the weapon
    @Column
    private Boolean longGun;

    @Column
    private Boolean lethal;


    public Weapon() {
    }

    public Weapon(String name, String serial_number, checkoutStatus status, Categories categoryId, Department departmentId, Boolean longGun, Boolean lethal) {
        super(name, serial_number, status, categoryId, departmentId);
        this.longGun = longGun;
        this.lethal = lethal;
    }

    public Boolean getLongGun() {
        return longGun;
    }

    public void setLongGun(Boolean longGun) {
        this.longGun = longGun;
    }

    public Boolean getLethal() {
        return lethal;
    }

    public void setLethal(Boolean lethal) {
        this.lethal = lethal;
    }

}
