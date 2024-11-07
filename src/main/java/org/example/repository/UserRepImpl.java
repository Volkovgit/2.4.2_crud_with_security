package org.example.repository;

import org.example.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class UserRepImpl implements UserRep {
    @PersistenceContext
    private EntityManager em;

    @Override
    public User getUserById(int userId) throws IllegalArgumentException {
        try {
            User user = em.find(User.class, userId);
            if (user != null) return user;
            if (user == null) throw new IllegalArgumentException("User with ID:" + userId + " is not found");
        } catch (IllegalArgumentException e) {
            System.out.println("User with ID:" + userId + " is not found");
            throw e;
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() throws IllegalArgumentException {
        try {
            String query = "select u from User u order by u.id";
            TypedQuery<User> typedQuery = em.createQuery(query, User.class);
            return typedQuery.getResultList();
        } catch (IllegalArgumentException e) {
            System.out.println("Cant select users from DB");
            throw e;
        }

    }

    @Override
    public void saveUser(User user) {
        try {
            em.persist(user);
        } catch (Error e) {
            System.out.println("Cant create user:" + user.toString());
            throw e;
        }
    }

    @Override
    public void deleteUser(User user) {
        try {
            User userFromDb = getUserById(user.getId());
            em.remove(userFromDb);
        } catch (Exception e) {
            System.out.println("Cant delete User with id : " + user.getId());
        }

    }

    @Override
    public void updateUser(int userId, User newUser) {
        User userFromDb = getUserById(userId);
        userFromDb.setAge(newUser.getAge());
        userFromDb.setName(newUser.getName());
    }
}
