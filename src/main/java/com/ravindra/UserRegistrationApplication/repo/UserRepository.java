package com.ravindra.UserRegistrationApplication.repo;


import com.ravindra.UserRegistrationApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
