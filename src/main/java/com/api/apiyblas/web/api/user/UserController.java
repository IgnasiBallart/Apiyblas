package com.api.apiyblas.web.api.user;

import com.api.apiyblas.domain.user.model.User;
import com.api.apiyblas.domain.user.UserRepository;
import com.api.apiyblas.web.api.user.resources.UserResource;
import com.api.apiyblas.web.api.user.resources.UserResourceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iballart on 21/11/18.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    UserResourceAssembler resourceAssembler;
    UserRepository userRepository;

    @Autowired
    public UserController(UserResourceAssembler resourceAssembler, UserRepository userRepository) {
        this.resourceAssembler = resourceAssembler;
        this.userRepository = userRepository;
    }

    @GetMapping(path = {"", "/"})
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping(path = {"/save"})
    public ResponseEntity<Resource<UserResource>> saveUser(@RequestBody User user) {
        userRepository.save(user);
        Resource<UserResource> halUser = resourceAssembler.toHALResource(user);
        halUser.add(resourceAssembler.linkToMe());

        return ResponseEntity.ok(halUser);
    }

    @GetMapping(value="/{username}")
    public ResponseEntity<Resource<UserResource>> findUser(@PathVariable String username) {

        Resource<UserResource> halUser = resourceAssembler.toHALResource(userRepository.findByUsername(username));
        halUser.add(resourceAssembler.linkToMe());

        return ResponseEntity.ok(halUser);
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
