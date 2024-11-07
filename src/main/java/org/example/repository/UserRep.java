package org.example.repository;


import org.example.model.User;

import java.util.List;

public interface UserRep {
    public User getUserById(int userId) throws IllegalArgumentException;
    public List<User> getAllUsers() throws IllegalArgumentException;

    public  void saveUser(User user);

    public void deleteUser(User user);

    public void updateUser(int userId, User newUser);
}
