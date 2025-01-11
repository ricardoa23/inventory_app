package services;

import models.Department;
import models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DepartmentRepository;
import repository.VehicleRepository;

@Service
public class DepartmentService extends BaseService<Department, Long> {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService (DepartmentRepository departmentRepository) { this.departmentRepository = departmentRepository; }

    @Override
    protected DepartmentRepository getRepository() { return departmentRepository; }

    @Override
    protected Department updateEntity(Department existingDepartment, Department departmentDetails) {
        existingDepartment.setDepartmentName(departmentDetails.getDepartmentName());
        return existingDepartment;
    }
}
