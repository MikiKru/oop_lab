package classExtended;

import classExtended.models.Animal;
import classExtended.models.Gender;

import java.time.LocalDate;

// psvm -> public static void main(){}
public class AnimalsController {

    public static void main(String[] args) {
        Animal animal = new Animal(
                LocalDate.of(2018,4,3),
                48,
                Gender.Male
        );
        // dostęp do publicznych składowtych klasy
        System.out.println("Przed zmianą liczby chromosomów: " +
                        animal.getChromosomsNumber());
        animal.setChromosomsNumber(46);
        System.out.println("Po zmianie liczby chromosomów: " +
                animal.getChromosomsNumber());
        // dostępo do składowych prywatnych klasy
//        animal.birthDate = LocalDate.now(); -> brak dostępu!
        // dostęp do składowych chronionych
//        animal.gender = Gender.Female; -> tylko dostęp w tym samym pakiecie
        System.out.println(animal);
    }
}
