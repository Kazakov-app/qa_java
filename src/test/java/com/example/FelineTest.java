package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Animal.animalKindCat;
import static com.example.Animal.foodPredator;
import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void eatMeat() throws Exception { assertEquals(foodPredator,feline.eatMeat()); }

    @Test
    public void getFamily() {
        assertEquals(animalKindCat, feline.getFamily());
    }

    @Test
    public void getKittens() {
        assertEquals(1, feline.getKittens());
    }
}