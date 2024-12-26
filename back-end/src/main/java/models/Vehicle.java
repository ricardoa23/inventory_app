package models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "vehicles")
public class Vehicle extends Item{
    @Column
    private String make;
    @Column
    private String model;
    @Column
    private int year;
    @Column
    private Date latestInspection;
    @Column
    private Date NextServiceInspection;
    @Column
    private boolean additionalTrainingRequirements;



}
