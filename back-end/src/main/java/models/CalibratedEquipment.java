package models;

import enums.checkoutStatus;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "calibrated_equipment")
public class CalibratedEquipment extends Item{
    @Column
    private Boolean RequiresCalibration;

    @Column
    private Date CalibrationDate;

    @Column
    private Date NextCalibrationDate;

    @Column
    private String CalibrationTolerance;

    public CalibratedEquipment() {
    }

    public CalibratedEquipment(String name, String serial_number, checkoutStatus status, Categories categoryId, Department departmentId, Boolean requiresCalibration, Date calibrationDate, Date nextCalibrationDate, String calibrationTolerance) {
        super(name, serial_number, status, categoryId, departmentId);
        this.RequiresCalibration = requiresCalibration;
        this.CalibrationDate = calibrationDate;
        this.NextCalibrationDate = nextCalibrationDate;
        this.CalibrationTolerance = calibrationTolerance;
    }

    public Boolean getRequiresCalibration() {
        return RequiresCalibration;
    }

    public void setRequiresCalibration(Boolean requiresCalibration) {
        RequiresCalibration = requiresCalibration;
    }

    public Date getCalibrationDate() {
        return CalibrationDate;
    }

    public void setCalibrationDate(Date calibrationDate) {
        CalibrationDate = calibrationDate;
    }

    public Date getNextCalibrationDate() {
        return NextCalibrationDate;
    }

    public void setNextCalibrationDate(Date nextCalibrationDate) {
        NextCalibrationDate = nextCalibrationDate;
    }

    public String getCalibrationTolerance() {
        return CalibrationTolerance;
    }

    public void setCalibrationTolerance(String calibrationTolerance) {
        CalibrationTolerance = calibrationTolerance;
    }
}
