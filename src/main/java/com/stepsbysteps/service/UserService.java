package com.stepsbysteps.service;

import com.stepsbysteps.data.User;
import com.stepsbysteps.data.jpa.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserPersistence persistence;

    public List<User> getAllUsers() {
        return persistence.findAll();}

    public User getUser(Long id){
        return persistence.findById(id).orElse(null);
    }

    public User save(User user) {
        if (userExists(user.getUserName())) {
            // Can't create user
            throw new RuntimeException("User name '"+user.getUserName()+"' is already taken.");
        }
        return persistence.save(user);

    }

    public void removeUser(Long id) {
        persistence.deleteById(id);
    }

    private boolean userExists(String userName) {
        User user = persistence.findByUserName(userName);
        return user != null;
    }

    public User getUser(User user) {
        User actualUser = persistence.findByUserName(user.getUserName());
        if (null == actualUser) {
            throw new RuntimeException("User name '"+user.getUserName()+"' does not exist.");
        }

        boolean userNameMatches = actualUser.getUserName().equals(user.getUserName());
        boolean passwordMatches = actualUser.getPassword().equals(user.getPassword());
        if (userNameMatches && passwordMatches) {
            return actualUser;
        }

        throw new RuntimeException("User name and password do not match.");
    }
}
