package org.example;

import org.example.config.AppConfig;
import org.example.model.Role;
import org.example.model.User;
//import org.example.service.RoleService;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    // Оставил этот файл для тестирования CRUD операций с хибером напрямую. Можно удалить при желании

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}