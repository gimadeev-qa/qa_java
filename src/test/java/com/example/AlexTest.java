package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {

    @Test
    public void testAlexIsMale() throws Exception {
        Alex alex = new Alex(Mockito.mock(Feline.class));

        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void testGetFriends() throws Exception {
        Alex alex = new Alex(Mockito.mock(Feline.class));

        List<String> actual = alex.getFriends();

        assertEquals(List.of("Марти", "Глория", "Мелман"), actual);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Alex alex = new Alex(Mockito.mock(Feline.class));

        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittensReturnsZero() throws Exception {
        Alex alex = new Alex(Mockito.mock(Feline.class));

        assertEquals(0, alex.getKittens());
    }
}