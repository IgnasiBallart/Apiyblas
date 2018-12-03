package com.api.apiyblas.controllers;

import com.api.apiyblas.model.User;
import com.api.apiyblas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iballart on 21/11/18.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = {"", "/"})
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping(path = {"", "/"})
    public String saveUser(@RequestBody User user) {
        userRepository.save(user);

        return user.getUsername();
    }

    @GetMapping(value="/{id}")
    public User findUser(@PathVariable String id) {
        return userRepository.findByInternalId(id);
    }
/*
    @PutMapping(value="/users/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        User usr = userRepository.findOne(id);
        if(user.getUsername() != null)
            usr.setUsername(user.getUsername());
        if(user.getPassword() != null)
            usr.setPassword(user.getPassword());
        userRepository.save(usr);
        return usr;
    }

    @DeleteMapping(value="/users/{id}")
    public String delete(@PathVariable String id) {
        User user = userRepository.findOne(id);
        userRepository.delete(user);

        return "product deleted";
    }*/
}
