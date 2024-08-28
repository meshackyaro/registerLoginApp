package com.myapp.registerloginapp.services;

import com.myapp.registerloginapp.dtos.requests.RegistrationRequests;
import com.myapp.registerloginapp.dtos.responses.RegistrationResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserServicesTest {
    @Autowired
    private UserService userService;

    @Test
    public void registerUserTest() {
        RegistrationRequests request = new RegistrationRequests();
        request.setUsername("username");
        request.setPassword("password");
        RegistrationResponse response = userService.registerUser(request);
        assertThat(response).isNotNull();
        assertThat(userService.getNumberOfUsers()).isEqualTo(1L);
    }
}
