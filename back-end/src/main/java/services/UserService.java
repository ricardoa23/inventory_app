package services;

import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserService extends BaseService<User, Long> {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserRepository getRepository() {
        return userRepository;
    }

    @Override
    protected User updateEntity(User existingEntity, User entityDetails) {
        existingEntity.setFirstName(entityDetails.getFirstName());
        existingEntity.setLastName(entityDetails.getLastName());
        existingEntity.setPreferredName(entityDetails.getPreferredName());
        existingEntity.setEmail(entityDetails.getEmail());
        //TODO: Complete this method
    }
}
