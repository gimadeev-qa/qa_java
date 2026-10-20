package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {

    private final String sex;
    private final boolean expectedMane;

    public LionParamTest(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters(name = "Пол = {0}, ожидаем гриву = {1}")
    public static Collection<Object[]> maneData() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false}
        });
    }

    @Test
    public void testConstructorSexBranch() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        Lion lion = new Lion(sex, feline);

        assertEquals(expectedMane, lion.doesHaveMane());
    }
}