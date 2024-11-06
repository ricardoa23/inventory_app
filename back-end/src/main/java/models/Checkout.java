package models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Checkout")
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(nullable = false, name = "checkout_date")
    private Date checkoutDate;

    @Column(nullable = false, name = "due_date")
    private Date dueDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private int categoryId;


}
