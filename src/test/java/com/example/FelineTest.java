package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.spy;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = spy(new Feline());
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals("Method eatMeat returns incorrect value.", expectedFood, actualFood);
    }


    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Method getFamily returns incorrect value.", expectedFamily, actualFamily);
    }

    @Test
    public void getKittensOneKittenTest() {
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals("Method getKittens returns incorrect value.", expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensRandomNumberTest() {
        Feline feline = new Feline();
        int kittensCount = 10;
        int expectedKittensCount = 10;
        int actualKittensCount = feline.getKittens(kittensCount);
        Assert.assertEquals("Method getKittens returns incorrect value.", expectedKittensCount, actualKittensCount);
    }
}
