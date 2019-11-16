package classExtended;

import java.time.LocalDate;

// psvm -> public static void main(){}
public class AnimalsController {

    public static void main(String[] args) {
        Animal animal = new Animal(
                LocalDate.of(2018,4,3),
                48,
                Gender.Male
        );
        System.out.println(animal);
    }
}
