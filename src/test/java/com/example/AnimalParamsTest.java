package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParamsTest {
    public static final String animalFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    private final String animalKind;
    private final List<String> animalFood;

    public AnimalParamsTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters(name = "animalClass{0} : animalFood{1}")
    public static Object [][] testDateGen() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFood() throws Exception  {
        Animal animal = new Animal();
        Object actual = animal.getFood(animalKind);
        assertEquals(animalFood, actual);
    }

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        assertEquals(animalFamily, actual);
    }
}