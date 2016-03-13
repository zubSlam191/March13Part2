package com.animals;

import com.animals.animalservices.Impl.BearImpl;
import com.animals.domain.AnimalType;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/03/13.
 */
public class AnimalTest {

    @Test
    public void testName() throws Exception {

        BearImpl zooAnimal = new BearImpl();
        System.out.println("Animal name is: "+zooAnimal.getAnimalType().getSpecies());
        Assert.assertEquals(zooAnimal.getAnimalType().getSpecies(), "Bear");
    }

   @Test
   public void testNumber() throws Exception{
       BearImpl zooAnimal = new BearImpl();
        AnimalType type = zooAnimal.getAnimalType();
        Assert.assertEquals(type.getNumberInZoo(),5);
    }

}
