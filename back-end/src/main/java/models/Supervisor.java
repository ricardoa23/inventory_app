package models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "supervisors")
public class Supervisor extends User{

    private int approvalLimit;
    private int authorizationLevel;
    private boolean canOverrideInventoryLimits;
    private boolean canGenerateReports;
    private boolean canManageUsers;
    private boolean canViewSensitiveData;

    @ElementCollection
    private List<String> certifications;

    @OneToMany(mappedBy = "supervisor")
    private List<User> subordinates;
    private LocalDate lastAuditDate;

    public Supervisor() {
    }

    public Supervisor(Long id, String firstName, String lastName, String preferredName, String email, String password, Role role, Department department, Set<Checkout> checkouts, int approvalLimit, int authorizationLevel, boolean canOverrideInventoryLimits, boolean canGenerateReports, boolean canManageUsers, boolean canViewSensitiveData, List<String> certifications, List<User> subordinates, LocalDate lastAuditDate) {
        super(id, firstName, lastName, preferredName, email, password, role, department, checkouts);
        this.approvalLimit = approvalLimit;
        this.authorizationLevel = authorizationLevel;
        this.canOverrideInventoryLimits = canOverrideInventoryLimits;
        this.canGenerateReports = canGenerateReports;
        this.canManageUsers = canManageUsers;
        this.canViewSensitiveData = canViewSensitiveData;
        this.certifications = certifications;
        this.subordinates = subordinates;
        this.lastAuditDate = lastAuditDate;
    }

    public Supervisor(String firstName, String lastName, String preferredName, String email, String password, Role role, Department department, Set<Checkout> checkouts, int approvalLimit, int authorizationLevel, boolean canOverrideInventoryLimits, boolean canGenerateReports, boolean canManageUsers, boolean canViewSensitiveData, List<String> certifications, List<User> subordinates, LocalDate lastAuditDate) {
        super(firstName, lastName, preferredName, email, password, role, department, checkouts);
        this.approvalLimit = approvalLimit;
        this.authorizationLevel = authorizationLevel;
        this.canOverrideInventoryLimits = canOverrideInventoryLimits;
        this.canGenerateReports = canGenerateReports;
        this.canManageUsers = canManageUsers;
        this.canViewSensitiveData = canViewSensitiveData;
        this.certifications = certifications;
        this.subordinates = subordinates;
        this.lastAuditDate = lastAuditDate;
    }

    public int getApprovalLimit() {
        return approvalLimit;
    }

    public void setApprovalLimit(int approvalLimit) {
        this.approvalLimit = approvalLimit;
    }

    public int getAuthorizationLevel() {
        return authorizationLevel;
    }

    public void setAuthorizationLevel(int authorizationLevel) {
        this.authorizationLevel = authorizationLevel;
    }

    public boolean isCanOverrideInventoryLimits() {
        return canOverrideInventoryLimits;
    }

    public void setCanOverrideInventoryLimits(boolean canOverrideInventoryLimits) {
        this.canOverrideInventoryLimits = canOverrideInventoryLimits;
    }

    public boolean isCanGenerateReports() {
        return canGenerateReports;
    }

    public void setCanGenerateReports(boolean canGenerateReports) {
        this.canGenerateReports = canGenerateReports;
    }

    public boolean isCanManageUsers() {
        return canManageUsers;
    }

    public void setCanManageUsers(boolean canManageUsers) {
        this.canManageUsers = canManageUsers;
    }

    public boolean isCanViewSensitiveData() {
        return canViewSensitiveData;
    }

    public void setCanViewSensitiveData(boolean canViewSensitiveData) {
        this.canViewSensitiveData = canViewSensitiveData;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    public List<User> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<User> subordinates) {
        this.subordinates = subordinates;
    }

    public LocalDate getLastAuditDate() {
        return lastAuditDate;
    }

    public void setLastAuditDate(LocalDate lastAuditDate) {
        this.lastAuditDate = lastAuditDate;
    }
}


