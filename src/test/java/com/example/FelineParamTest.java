package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {

    private final int kittensCount;

    public FelineParamTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters(name = "getKittens({0}) должен вернуть {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0},
                {1},
                {2},
                {5},
                {10},
                {100}
        });
    }

    @Test
    public void testGetKittensWithCount() {
        Feline feline = new Feline();

        int actual = feline.getKittens(kittensCount);

        assertEquals(kittensCount, actual);
    }
}