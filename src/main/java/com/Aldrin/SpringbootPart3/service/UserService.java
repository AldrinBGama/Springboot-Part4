package com.Aldrin.SpringbootPart3.service;

import com.Aldrin.SpringbootPart3.dao.UserDao;
import com.Aldrin.SpringbootPart3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserDao usersDao;

    public Collection<User> getAllUsers() {
        return this.usersDao.getUsers();
    }

    public User getUserById(UUID id){
        return this.usersDao.getUserById(id);
    }

    public void removeUserById(UUID id){
        this.usersDao.removeUserById(id);
    }

    public void upadateUserById(User user){
        this.usersDao.upadateUserById(user);
    }
}
