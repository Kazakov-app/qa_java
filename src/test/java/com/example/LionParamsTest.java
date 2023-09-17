package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Spy;

@RunWith(Parameterized.class)
public class LionParamsTest {

    @Spy
    Feline feline;

    private final String animalSex;

    public LionParamsTest(String animalSex) {
        this.animalSex = animalSex;
    }

    @Parameterized.Parameters(name = "animalSex {0}")
    public static Object[][] testDateGen() {
        return new Object[][]{
                {"Самец"},
                {"Самка"}
        };
    }

    @Test
    public void LionParams() throws Exception {
        new Lion(feline, animalSex);
    }
}

