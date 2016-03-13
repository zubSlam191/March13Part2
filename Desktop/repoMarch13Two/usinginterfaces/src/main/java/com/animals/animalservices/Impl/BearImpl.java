package com.animals.animalservices.Impl;

import com.animals.domain.AnimalType;
import com.animals.animalservices.Zoo;

/**
 * Created by student on 2016/03/13.
 */
public class BearImpl implements Zoo{
    public AnimalType getAnimalType(){
    AnimalType animalData = new AnimalType();
        animalData.setSpecies("Bear");
        animalData.setNumberInZoo(5);
    return animalData;
}
}
