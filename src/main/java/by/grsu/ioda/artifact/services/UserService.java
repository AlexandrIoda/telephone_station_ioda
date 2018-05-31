package by.grsu.ioda.artifact.services;

import by.grsu.ioda.artifact.model.User;
import by.grsu.ioda.artifact.DataTransferObject.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);

    User save(UserRegistrationDto registration);
    User save(User registration);
}