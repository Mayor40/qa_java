package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.mockito.Mockito.spy;

@RunWith(Parameterized.class)
public class LionManeTest {
    String sex;
    private final boolean hasMane;
    public LionManeTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(hasMane, actual);
    }


}
