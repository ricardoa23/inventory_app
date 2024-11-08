package models;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle extends Item{
    //TODO: Create this class should contain make model year and other features of said equipment should also implements if vehicle requires additional certifications to drive i.e. off-road vehicles speciality vehicles
}
