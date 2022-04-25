package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(100);
        int actualKittens = lion.getKittens();
        Assert.assertEquals(feline.getKittens(), actualKittens);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(feline.getFood("Хищник"), actualFood);
    }
}
