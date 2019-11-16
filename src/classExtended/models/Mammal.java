package classExtended.models;

import java.time.LocalDate;

public class Mammal extends Animal {

    private String species;

    public Mammal(
            LocalDate birthDate,
            int chromosomsNumber,
            Gender gender,
            String species) {
        // wyołuje konstruktor klasy nadrzędnej
        super(birthDate, chromosomsNumber, gender);
        this.species = species;
    }
    // metody

    @Override
    public String toString() {
        return "Mammal{" +
                "species='" + species + '\'' +
                "} " + super.toString(); // wywołanie metody toString klasy nadrzędnej
    }

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
}
