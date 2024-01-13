package org.example.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTests {

    private Square square;
    @Before
    public void setUp(){
        square = new Square();
    }

    @Test
    public void square4_happyPath() {
        int number = 4;

        boolean expected = true;

        boolean actual = square.isSquare(number);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void square3_badPath() {
        int number = 3;

        boolean expected = false;

        boolean actual = square.isSquare(number);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void square0_happyPath() {
        int number = 0;

        boolean expected = true;

        boolean actual = square.isSquare(number);

        Assert.assertEquals(expected, actual);
    }
}
