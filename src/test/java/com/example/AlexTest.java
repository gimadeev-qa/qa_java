package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {

    private Alex alex;
    @Before
    public void setUp() throws Exception {
        alex = new Alex(Mockito.mock(Feline.class));

    }

    @Test
    public void testAlexIsMale() throws Exception {

        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void testGetFriends() throws Exception {


        List<String> actual = alex.getFriends();

        assertEquals(List.of("Марти", "Глория", "Мелман"), actual);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {


        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittensReturnsZero() throws Exception {


        assertEquals(0, alex.getKittens());
    }
}