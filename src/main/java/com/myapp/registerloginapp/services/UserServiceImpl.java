package com.myapp.registerloginapp.services;

import com.myapp.registerloginapp.data.models.User;
import com.myapp.registerloginapp.data.repositories.UserRepository;
import com.myapp.registerloginapp.dtos.requests.RegistrationRequests;
import com.myapp.registerloginapp.dtos.responses.RegistrationResponse;
import com.myapp.registerloginapp.exceptions.UserAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public RegistrationResponse registerUser(RegistrationRequests request) {
        User foundUser = new User();
        if (foundUser.getUsername() != null) throw new UserAlreadyExistException("user already exist");
        foundUser.setUsername(request.getUsername());
        foundUser.setPassword(request.getPassword());
        userRepository.save(foundUser);

        RegistrationResponse response = new RegistrationResponse();
        response.setMessage("User registered successfully");
        return response;
    }

    @Override
    public Long getNumberOfUsers() {
        return userRepository.count();
    }
}
