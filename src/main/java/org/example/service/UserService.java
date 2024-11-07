package org.example.service;

import org.example.model.User;

import java.util.List;

public interface UserService {
    User getUserById(int userId);
    List<User> listUsers();

    public  void saveUser(User user);

    public void deleteUser(User user);

    public void updateUser(int userId, User newUser);

}
