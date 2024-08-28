package com.myapp.registerloginapp.services;

import com.myapp.registerloginapp.dtos.requests.RegistrationRequests;
import com.myapp.registerloginapp.dtos.responses.RegistrationResponse;

public interface UserService {
    RegistrationResponse registerUser(RegistrationRequests request);

    Long getNumberOfUsers();
}
