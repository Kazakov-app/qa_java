package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Animal.foodPredator;
import static com.example.Cat.catSound;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Spy
    Feline feline;

    @Test
    public void catGetSoundTest(){
        Cat cat = new Cat(feline);
        assertEquals(catSound, cat.getSound());
    }

    @Test
    public void catEatMeatTest() throws Exception {
        Cat cat = new Cat(feline);
        assertEquals(foodPredator, cat.getFood());
    }
}
