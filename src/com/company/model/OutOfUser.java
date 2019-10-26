package com.company.model;

public class OutOfUser {
    public static void main(String[] args) {
        // utworzenie obiektu klasy User
        User user = new User();
        // odwołanie do pola kalasy User
        user.user_id = 1L;
        user.name = "Michał";
        // specyfikator private nie jest widoczny poza klasą
//        user.lastName = "Kruczkowski";
//        System.out.printf("Id: %d\nName: %s\nLastname: %s\n", user.user_id, user.name, user.lastName);
        System.out.println(user);
    }
}
