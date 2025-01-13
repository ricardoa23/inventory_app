package models;

import enums.checkoutStatus;
import enums.itemType;
import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(nullable = false, name = "checkout_status")
    private checkoutStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Categories categoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department departmentId;

    @Column
    private itemType itemType;

    public Item() {
    }

    public Item(int id, String name, String serialNumber, checkoutStatus status, Categories categoryId, Department departmentId, enums.itemType itemType) {
        this.id = id;
        this.name = name;
        this.serialNumber = serialNumber;
        this.status = status;
        this.categoryId = categoryId;
        this.departmentId = departmentId;
        this.itemType = itemType;
    }

    public Item(String name, String serialNumber, checkoutStatus status, Categories categoryId, Department departmentId, enums.itemType itemType) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.status = status;
        this.categoryId = categoryId;
        this.departmentId = departmentId;
        this.itemType = itemType;
    }

    public Item(String name, String serialNumber, checkoutStatus status, Categories categoryId, Department departmentId) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.status = status;
        this.categoryId = categoryId;
        this.departmentId = departmentId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serial_number) {
        this.serialNumber = serial_number;
    }

    public checkoutStatus getStatus() {
        return status;
    }

    public void setStatus(checkoutStatus status) {
        this.status = status;
    }

    public Categories getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Categories categoryId) {
        this.categoryId = categoryId;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public itemType getItemType() {
        return itemType;
    }

    public void setItemType(itemType itemType) {
        this.itemType = itemType;
    }
}
