package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionManeTest {
    String sex;
    private final boolean hasMane;

    public LionManeTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("Method doesHaveMane returns incorrect value.", hasMane, actual);
    }


}
