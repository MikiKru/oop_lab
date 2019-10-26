package com.company;

import com.company.model.User;

public class Main {

    public static void main(String[] args) {
        // utworzenie obiektu klasy User
        User user = new User();
        // odwołanie do pola kalasy User
        // specyfiaktor public jest widoczny w całym projekcie
        user.user_id = 1L;
        // specyfiaktor protected nie jest widoczny poza pakietem
//        user.name = "Michał";
        // specyfikator private nie jest widoczny poza klasą
//        user.lastName = "Kruczkowski";
//        System.out.printf("Id: %d\nName: %s\nLastname: %s\n", user.user_id, user.name, user.lastName);
        System.out.println(user);
        System.out.println(user.user_id);
    }
}
