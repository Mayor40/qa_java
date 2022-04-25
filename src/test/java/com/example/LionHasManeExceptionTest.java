package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionHasManeExceptionTest {

    @Test
    public void doesHaveManeWithExceptionTest() {
        Exception exception = null;
        try {
            Lion lion = new Lion("Крокодил");
            lion.doesHaveMane();
        } catch (Exception ex) {
            exception = ex;
            assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
        }
    }
}
