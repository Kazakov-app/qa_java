package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Spy;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(Parameterized.class)
public class LionParamsTest {

    @Spy
    Feline feline;

    private final String animalSex;
    private final boolean hasMane;

    public LionParamsTest(String animalSex, boolean hasMane) {
        this.animalSex = animalSex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "animalSex {0}")
    public static Object[][] testDateGen() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void LionParams() throws Exception {
        MatcherAssert.assertThat(new Lion(feline, animalSex).doesHaveMane(),equalTo(hasMane));
    }
}

