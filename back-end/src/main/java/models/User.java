package models;

import jakarta.persistence.*;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false, name = "employee_id")
    private int employeeId;
    @Column (nullable = false)
    private String name;
    @Column (unique = true)
    private String email;
    @Column (nullable = false)
    private String password;
    
}
