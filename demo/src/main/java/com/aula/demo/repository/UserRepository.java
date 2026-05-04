package com.aula.demo.repository;

import com.aula.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User,Long> {
    UserDetails findByLongin(String role);
}
