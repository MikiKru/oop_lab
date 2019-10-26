package mvc.model;

import java.time.LocalDateTime;
// struktura danych
public class User {
    // składowa statyczna - nie jest związana z obiektem a z samą klasą
    public static long static_id = 1;
    // prywatne pola
    private long user_id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime registrationDateTime = LocalDateTime.now(); // przypisanie aktualnej dany i czasu
    private boolean isActive = true;
    // konstruktor
    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        // przypisanie do user_id aktualnej wartości statycznej
        this.user_id = static_id;
        // inkrementacja składowej statycznej przy każdym utworzeniu obiektu
        static_id ++;
    }
    // toString() - napisowa reprezentacja obiektu
    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", registrationDateTime=" + registrationDateTime +
                ", isActive=" + isActive +
                '}';
    }
    // publiczne metody dostępowe gettery i settery
    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
