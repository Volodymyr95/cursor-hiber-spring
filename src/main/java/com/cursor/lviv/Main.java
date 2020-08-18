package com.cursor.lviv;

import com.cursor.lviv.config.Config;
import com.cursor.lviv.models.Book;
import com.cursor.lviv.models.User;
import com.cursor.lviv.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        var annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(Config.class);

        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
       // userService.createUser(new User("Arnold", List.of(new Book("Test"))));
        System.out.println(userService.getUserById(2l));

    }
}
//ORM - Object Relation Mapping