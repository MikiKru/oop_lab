package classExtended.models;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface AnimalsControllerInterface {
    // pole publiczne statyczne i finalne
    List<Animal> animals = new ArrayList<>(Arrays.asList(
            new Animal(LocalDate.now(), 22, Gender.Male),
            new Mammal(LocalDate.now(), 33, Gender.Female, "kot"),
            new Mammal(LocalDate.now(), 33, Gender.Female, "pies"),
            new Mammal(LocalDate.now(), 33, Gender.Male, "pies")
    ));

    // metody abstrakcyjne - zawsze są publiczne
    boolean compareAnimalsByChromosomNumbers(Animal a1, Animal a2);

    void getAllAnimals();

    List<Animal> getAnimalsBySpecies(String species);
}
