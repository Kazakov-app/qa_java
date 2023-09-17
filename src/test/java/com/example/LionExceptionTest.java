package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Spy;

import static com.example.Lion.message;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionExceptionTest {

    @Spy
    Feline feline;

    private final String animalSex;
    public LionExceptionTest(String animalSex) {
        this.animalSex = animalSex;
    }
    @Parameterized.Parameters(name = "animalSex {0}")
    public static Object[][] testDateGen() {
        return new Object[][]{
                  {"Самец"},
                  {"Самка"},
                  {"OtherSex"}
        };
    }

    @Test
    public void lionSexError() {
        try {
            new Lion(feline, animalSex);
        } catch (ClassCastException e) {
            assertThrows(Exception.class, () -> new Lion(feline, animalSex));
        } catch (Exception e) {
            Assert.assertEquals(message, e.getMessage());
        }
    }
}





