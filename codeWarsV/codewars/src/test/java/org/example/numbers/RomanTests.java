package org.example.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanTests {

    RomanConverter converter;

    @Before
    public void setUp(){
        converter = new RomanConverter();
    }

    @Test
    public void test_III_happyPath(){
        String data = "III";

        int expected = 3;
        int actual = converter.convert(data);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_LVIII_happyPath(){
        String data = "LVIII";

        int expected = 58;
        int actual = converter.convert(data);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_MCMXCIV_happyPath(){
        String data = "MCMXCIV";

        int expected = 1994;
        int actual = converter.convert(data);

        Assert.assertEquals(expected, actual);
    }
}
