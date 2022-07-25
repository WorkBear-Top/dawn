package com.example.dawn.repo;

import com.example.dawn.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author workbear
 */
public interface RoleRepo extends JpaRepository<Role, Long> {
    /**
     * this is a test method
     * @param name
     * @return
     */
    Role findByName(String name);
}
