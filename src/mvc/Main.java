package mvc;

import mvc.controller.UserController;

public class Main {
    public static void main(String[] args) {
        // testowanie projektu mvc
        // utworzenie obiektu klasy UserController
        UserController uc = new UserController();
        // utowrzenie i dodanie użytkowników do listy
        uc.addUser("M","M","m@m.pl","mmm");
        uc.addUser("K","K","k@k.pl","kkk");
        uc.addUser("L","L","l@l.pl","lll");
        uc.addUser("X","X","x@x.pl","xxx");
        // wypisanie zawartości listy
        uc.getAllUsers();
    }
}
