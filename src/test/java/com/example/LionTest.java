package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Animal.foodPredator;
import static com.example.Lion.animalSexFemale;
import static com.example.Lion.animalSexMale;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Spy
    Feline feline;
    @Spy
    Lion lion;

    public LionTest() throws Exception {
        this.lion = new Lion(feline, animalSexMale);
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(feline, animalSexMale);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void maleDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline, animalSexMale);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline,animalSexFemale);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(feline, animalSexMale);
        assertEquals(foodPredator, lion.getFood());
    }
}

