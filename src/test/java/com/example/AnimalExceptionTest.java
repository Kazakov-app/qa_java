package com.example;

import org.junit.Test;

import static com.example.Animal.animalKindCat;
import static com.example.Animal.animalKindException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class AnimalExceptionTest {

    public static final String message = "Expected Exception";

    @Test
    public void animalException() {
        Animal animal = new Animal();
        try {
            animal.getFood(animalKindCat);
            fail(message);
        } catch (Exception e) {
            assertEquals(animalKindException, e.getMessage());
        }
    }
}
