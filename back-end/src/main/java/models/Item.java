package models;

import enums.checkoutStatus;
import jakarta.persistence.*;

@Entity
@Table (name = "item")
public class Item {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (nullable = false)
    private String name;

    @Column (name = "serial_number")
    private String serial_number;

    @Column (nullable = false, name = "checkout_status")
    private checkoutStatus status;

    @ManyToOne ()
    @Column ()

}
