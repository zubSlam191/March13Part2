package com.animals.domain;

import java.io.Serializable;

/**
 * Created by student on 2016/03/13.
 */
public class AnimalType implements Serializable {
    private String species;
    private int numberInZoo;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getNumberInZoo() {
        return numberInZoo;
    }

    public void setNumberInZoo(int numberInZoo) {
        this.numberInZoo = numberInZoo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimalType data = (AnimalType) o;

        return numberInZoo == data.numberInZoo;

    }

    @Override
    public int hashCode() {
        return numberInZoo;
    }

    @Override
    public String toString() {
        return "AnimalType{" +
                "Number in zoo=" + numberInZoo +
                '}';
    }
}
