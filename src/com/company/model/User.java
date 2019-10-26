package com.company.model;
// ALT + Ins -> auto generate
// psvm -> main method template
// sout -> System.out.println()
// ALT + Enter -> auto hints
// CTRL + / - line comment
// implementacja wzorca JavaBeans
public class User {
    public Long user_id;
    protected String name;
    private String lastName;
    // konstruktor domyślny - bez parametrów i bez implementacji
    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // utworzenie obiektu klasy User
        User user = new User();
        // odwołanie do pola kalasy User
        user.user_id = 1L;
        user.name = "Michał";
        user.lastName = "Kruczkowski";

        System.out.printf("Id: %d\nName: %s\nLastname: %s\n", user.user_id, user.name, user.lastName);
        System.out.println(user);
    }
}
