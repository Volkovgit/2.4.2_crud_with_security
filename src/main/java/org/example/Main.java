package org.example;

import org.example.config.AppConfig;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    // Оставил этот файл для тестирования CRUD операций с хибером напрямую. Можно удалить при желании

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userRep = context.getBean(UserService.class);


//        System.out.println("-- Get all users --");
//        List<User> usersList = userRep.listUsers();
//        for(User us : usersList){
//            System.out.println(us);
//        }

//        System.out.println("-- Get User by id --");
//        User userFromDb = userRep.getUserById(55);
//        System.out.println(userFromDb);


//        System.out.println("-- Delete user --");
//        User userById = userRep.getUserById(55);
//        userRep.deleteUser(userById);
//
//        System.out.println("-- Save user --");
//        User newUser = new User("Tes4444",55);
//        userRep.saveUser(newUser);

//        System.out.println("-- Update user --");
//        int userId = 2;
//        User newUser = new User("NewNam232323e",33);
//        userRep.updateUser(5,newUser);
//        System.out.println(userRep.getUserById(15));

//        System.out.println("-- Get all users --");
//        List<User> usersList2 = userRep.listUsers();
//        for(User us : usersList2){
//            System.out.println(us);
//        }


//        System.out.println(usersList);

//        System.out.println("Hello world!");
    }
}