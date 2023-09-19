package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Spy
    Feline feline;
    String animalSex;

    @Test
    public void lionSexError() {
        try {
            new Lion(feline, animalSex);
        } catch (Exception e) {
            assertThrows(Exception.class, () -> new Lion(feline, animalSex));
        }
    }
}





