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

    public List<User> getAllUsers(){
        return persistence.findAll();}

    public User getUser(Long id){
        return persistence.findById(id).orElse(null);
    }

    public void save(User user) {
        persistence.save(user);
    }

    public void removeUser(Long id) {
        persistence.deleteById(id);
    }
}