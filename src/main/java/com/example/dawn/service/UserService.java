package com.example.dawn.service;

import com.example.dawn.domain.Role;
import com.example.dawn.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author workbear
 */
@Service
public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
