package mvc.controller;

import mvc.model.User;
import java.util.*;

// implementuje logikę biznesową
public class UserController {
    // lista przechowująca obiekty klasy User
    private List<User> users = new ArrayList<>();
    // metoda dodająca użytkownika do listy użytkowników
    public void addUser(
            String name, String lastName,
            String email, String password){
        // utworzenie obiektu klasy User
        User user = new User(name, lastName, email, password);
        System.out.println("Utworzono: \n" + user);
        // dodanie obiektu user do listy users
        users.add(user);
    }
    public void getAllUsers(){
        // skrócony zapis pętli for-each
        users.forEach(System.out::println);
    }


}
