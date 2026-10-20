package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void testEatMeatReturnsPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        List<String> actual = feline.eatMeat();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetFamilyReturnsFeline() {
        String actual = feline.getFamily();

        assertEquals("Кошачьи", actual);
    }

    @Test
    public void testGetKittensDefaultReturnsOne() {
        int actual = feline.getKittens();

        assertEquals(1, actual);
    }
}