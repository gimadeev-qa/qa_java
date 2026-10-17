package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void testDoesHaveManeMale() throws Exception {
        Lion lion = new Lion("Самец", feline);

        boolean actual = lion.doesHaveMane();

        assertTrue(actual);
    }

    @Test
    public void testDoesHaveManeFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);

        boolean actual = lion.doesHaveMane();

        assertFalse(actual);
    }

    @Test
    public void testConstructorThrowsOnInvalidSex() {
        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion("Неизвестно", feline)
        );

        assertEquals(
                "Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage()
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