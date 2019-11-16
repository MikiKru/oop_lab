package classExtended;

import java.time.LocalDate;

// ALT + Ins -> generate
// ALT + ENTER -> autopodpowiedź
public class Animal extends Object {
    // pola
    private LocalDate birthDate;
    private int chromosomsNumber;
    private Gender gender;

    // konstruktor
    public Animal(LocalDate birthDate, int chromosomsNumber, Gender gender) {
        this.birthDate = birthDate;
        this.chromosomsNumber = chromosomsNumber;
        this.gender = gender;
    }
    // metody
    @Override
    public String toString() {
        return "Animal{" +
                "birthDate=" + birthDate +
                ", chromosomsNumber=" + chromosomsNumber +
                ", gender=" + gender +
                '}';
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getChromosomsNumber() {
        return chromosomsNumber;
    }

    public void setChromosomsNumber(int chromosomsNumber) {
        this.chromosomsNumber = chromosomsNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
