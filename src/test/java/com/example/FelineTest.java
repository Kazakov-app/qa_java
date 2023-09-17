package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void eatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void getFamily() {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
    }

    @Test
    public void getKittens() {
        feline.getKittens();
        Mockito.verify(feline).getKittens();
    }
}