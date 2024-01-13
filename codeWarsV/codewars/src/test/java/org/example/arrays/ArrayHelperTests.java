package org.example.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayHelperTests {
    private ArrayHelper helper;
    @Before
    public void setUp(){
        helper = new ArrayHelper();
    }

    @Test
    public void divideDividedWithFiveNumberAndDividerWithNumberTwo_happyPath() {
        int[] divided = {
                1, 2, 2, 2, 3
        };

        int[] divider = {
                2
        };

        int[] expected = {
              1, 3
        };

        int[] actual = helper.divide(divided, divider);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void divideBlankDividedAndDividerWithTwoNumbers_happyPath() {
        int[] divided = {

        };

        int[] divider = {
                2, 3
        };

        int[] expected = {
        };

        int[] actual = helper.divide(divided, divider);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void divide_bestPracticeBlankDividedAndDividerWithTwoNumbers_happyPath() {
        int[] divided = {

        };

        int[] divider = {
                2, 3
        };

        int[] expected = {
        };

        int[] actual = helper.divide_bestPractice(divided, divider);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void divide_bestPracticeDividedWithFiveNumberAndDividerWithNumberTwo_happyPath() {
        int[] divided = {
                1, 2, 2, 2, 3
        };

        int[] divider = {
                2
        };

        int[] expected = {
                1, 3
        };

        int[] actual = helper.divide_bestPractice(divided, divider);

        Assert.assertArrayEquals(expected, actual);
    }
}
