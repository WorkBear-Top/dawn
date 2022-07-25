package com.example.dawn.repo;

import com.example.dawn.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author workbear
 */
public interface UserRepo extends JpaRepository<User, Long> {
    /**
     * this is a test method
     * @param username
     * @return
     */
    User findByUsername(String username);
}
