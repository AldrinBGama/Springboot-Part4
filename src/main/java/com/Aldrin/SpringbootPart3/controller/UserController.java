package com.Aldrin.SpringbootPart3.controller;

import com.Aldrin.SpringbootPart3.model.User;
import com.Aldrin.SpringbootPart3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<User> viewAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") UUID id){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public  void removeUsersById(@PathVariable("id") UUID id){
        userService.removeUserById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public  void updateUsersById(User users){
        userService.upadateUserById(users );
    }
}
