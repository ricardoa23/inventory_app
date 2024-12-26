package models;

import enums.checkoutStatus;
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

    public Vehicle() {}

    public Vehicle(String name, String serial_number, checkoutStatus status, Categories categoryId, Department departmentId, String make, String model, int year, Date latestInspection, Date nextServiceInspection, boolean additionalTrainingRequirements) {
        super(name, serial_number, status, categoryId, departmentId);
        this.make = make;
        this.model = model;
        this.year = year;
        this.latestInspection = latestInspection;
        NextServiceInspection = nextServiceInspection;
        this.additionalTrainingRequirements = additionalTrainingRequirements;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getLatestInspection() {
        return latestInspection;
    }

    public void setLatestInspection(Date latestInspection) {
        this.latestInspection = latestInspection;
    }

    public Date getNextServiceInspection() {
        return NextServiceInspection;
    }

    public void setNextServiceInspection(Date nextServiceInspection) {
        NextServiceInspection = nextServiceInspection;
    }

    public boolean isAdditionalTrainingRequirements() {
        return additionalTrainingRequirements;
    }

    public void setAdditionalTrainingRequirements(boolean additionalTrainingRequirements) {
        this.additionalTrainingRequirements = additionalTrainingRequirements;
    }
}
