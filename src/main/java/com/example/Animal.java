package com.example;

import java.util.List;

public class Animal {

    public static final String animalKindHerbivore = "Травоядное";
    public static final String animalKindPredator = "Хищник";
    public static final List<String> foodHerbivore = List.of("Трава", "Различные растения");
    public static final List<String> foodPredator = List.of("Животные", "Птицы", "Рыба");
    public static final String animalKindException = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    public static final String animalFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    public static final String animalKindCat = "Кошачьи";

    public List<String> getFood(String animalKind) throws Exception {
        if (animalKindHerbivore.equals(animalKind)) {
            return foodHerbivore;
        } else if (animalKindPredator.equals(animalKind)) {
            return foodPredator;
        } else {
            throw new Exception(animalKindException);
        }
    }

    public String getFamily() {
        return animalFamily;
    }
}