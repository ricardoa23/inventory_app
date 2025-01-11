package services;

import models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoleRepository;

@Service
public class RoleService extends BaseService<Role, Long> {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) { this.roleRepository = roleRepository; }

    @Override
    protected RoleRepository getRepository() { return roleRepository; }

    @Override
    protected Role updateEntity(Role existingRole, Role roleDetails) {
        existingRole.setRoleName(roleDetails.getRoleName());
        return existingRole;
    }
       
}
