package classExtended;

import classExtended.models.Animal;
import classExtended.models.Gender;
import classExtended.models.Mammal;

import java.time.LocalDate;

// psvm -> public static void main(){}
public class AnimalsController {

    public boolean compareAnimalsByChromosomNumbers(Animal a1, Animal a2){
        return a1.getChromosomsNumber() > a2.getChromosomsNumber();
    }


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

        Mammal mammal = new Mammal(
                LocalDate.of(2010, 10,10),
                32,
                Gender.Male,
                "kot"
        );
        // publiczne składowe klasy
        mammal.setChromosomsNumber(33);
        // prywatne składowe klasy
//        mammal.species = "X"; -> brak dostępu
        // składowe chronione
//        mammal.gender = Gender.Both; -> tylok dostęp w pakiecie models
        System.out.println(mammal);

        // POLIMORFIZM
        Animal a1 = new Mammal(LocalDate.now(), 12, Gender.Female, "pies");
        System.out.println(a1.getClass());

        // NAPISZ METODĘ KTÓRA PORÓNUJE DWA ZWIERZAKI POD WZGLĘDEM LICZBY CHROMOSOMÓW
        // -> FUNKCJA ZWRACA true jeśli pierwszys obkiet ma więcej chromosomów
        // -> W PRZECIWNYM PRZYPADKU ZWRACA FALSE

        AnimalsController ac = new AnimalsController();
        System.out.println(ac.compareAnimalsByChromosomNumbers(mammal, mammal));

    }
}
