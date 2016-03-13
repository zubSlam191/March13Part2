package com.animals.animalservices.Impl;

import com.animals.animalservices.Zoo;
import com.animals.domain.AnimalType;

/**
 * Created by student on 2016/03/13.
 */
public class DogImpl implements Zoo {
    public AnimalType getAnimalType(){
        AnimalType animalData = new AnimalType();
        animalData.setSpecies("Dog");
        animalData.setNumberInZoo(8);
        return animalData;
    }
}
