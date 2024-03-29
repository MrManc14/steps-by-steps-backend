package com.stepsbysteps.rest.controller;

import com.stepsbysteps.data.User;
import com.stepsbysteps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User getUserById(@PathVariable(name = "id") Long id) {
        return service.getUser(id);
    }

    @GetMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User getUser(@RequestParam(name = "userName") String userName,
                        @RequestParam(name = "password") String password) {
        // This checks if user exists by returning the user
        return service.getUser(new User(userName, password));
    }

    @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User createUser(@RequestBody User user) {
        System.out.println(user);

        return service.save(user);
    }

    @DeleteMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void deleteUser(@PathVariable(name = "id") Long id) {
        service.removeUser(id);
    }

}
