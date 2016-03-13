package com.animals.animalservices.Impl;

import com.animals.animalservices.Zoo;
import com.animals.domain.AnimalType;

/**
 * Created by student on 2016/03/13.
 */
public class CowImpl implements Zoo {
    public AnimalType getAnimalType(){
    AnimalType animalData = new AnimalType();
        animalData.setSpecies("Cow");
        animalData.setNumberInZoo(10);
    return animalData;
}
}
