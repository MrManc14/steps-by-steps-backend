package com.stepsbysteps.rest.controller;

import com.stepsbysteps.data.User;
import com.stepsbysteps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User getUserById(@PathVariable(name = "id") Long id) {
        return service.getUser(id);
    }

    @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void createUser(@RequestBody User user) {
        service.save(user);
    }

    @DeleteMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void deleteUser(@PathVariable(name = "id") Long id) {
        service.removeUser(id);
    }

}
