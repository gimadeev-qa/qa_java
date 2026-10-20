package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertThrows;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void testConstructorThrowsOnInvalidSex() {
        String actualMessage = assertThrows(
                Exception.class,
                () -> new Lion("Неизвестно", feline)
        ).getMessage();

        assertEquals(
                "Используйте допустимые значения пола животного - самец или самка",
                actualMessage
        );
    }

    @Test
    public void testGetKittensFromFeline() throws Exception {
        when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", feline);

        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testGetFoodFromFeline() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        when(feline.getFood("Хищник")).thenReturn(expected);

        Lion lion = new Lion("Самец", feline);

        assertEquals(expected, lion.getFood());
    }
}