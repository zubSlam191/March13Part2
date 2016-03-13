package com.animals;

import com.animals.animalservices.Zoo;
import com.animals.conf.AppConfig;
import com.animals.domain.AnimalType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/03/13.
 */
public class AnimalTest {

    private Zoo zoo;

    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        zoo = (Zoo)ctx.getBean("bear");
    }

    @Test
    public void testName() throws Exception {

        AnimalType zooAnimal = zoo.getAnimalType();
        System.out.println("Animal name is: "+zooAnimal.getSpecies());
        Assert.assertEquals(zooAnimal.getSpecies(), "Bear");
    }

   @Test
   public void testNumber() throws Exception{
       AnimalType zooAnimal = zoo.getAnimalType();
        Assert.assertEquals(zooAnimal.getNumberInZoo(),5);
    }

}
