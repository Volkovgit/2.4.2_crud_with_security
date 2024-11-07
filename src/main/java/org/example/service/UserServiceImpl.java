package org.example.service;

import org.example.model.User;
import org.example.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRep userRep;

    public User getUserById(int userId) {
        return userRep.getUserById(userId);
    }

    public List<User> listUsers() {
        return (List<User>) userRep.getAllUsers();
    }

    @Override
    public void saveUser(User user) {
        userRep.saveUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userRep.deleteUser(user);
    }

    @Override
    public void updateUser(int userId, User newUser) {
        userRep.updateUser(userId,newUser);
    }
}
