package com.zaradev.usermanager;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        validate(user);
        users.add(user);
    }
    
    private void validate(User user) {
        if (user.getUsername() == null || user.getUsername().isBlank()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (!user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User must be adult");
        }
    }

    public List<User> getAllUsers() {
        return users;
    }
}
