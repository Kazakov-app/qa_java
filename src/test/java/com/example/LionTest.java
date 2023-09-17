package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Lion.animalSexMale;


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
    public void getKittens() {
        lion.getKittens();
        Mockito.verify(lion).getKittens();
    }

    @Test
    public void doesHaveMane() {
        lion.doesHaveMane();
        Mockito.verify(lion).doesHaveMane();
    }

    @Test
    public void getFood() throws Exception {
        lion.getFood();
        Mockito.verify(lion).getFood();
    }
}

