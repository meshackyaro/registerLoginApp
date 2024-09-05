package com.myapp.registerloginapp.data.repositories;

import com.myapp.registerloginapp.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
