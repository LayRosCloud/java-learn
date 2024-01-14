package org.example.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumsTests {

    private TwoSums twoSums;
    @Before
    public void setUp(){
        twoSums = new TwoSums();
    }

    @Test
    public void test1_happyPath() {
        int target = 6;
        int[] array = {
            3, 3
        };

        int[] expected = {
                0, 1
        };

        int[] actual = twoSums.twoSum(array, target);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2_happyPath() {
        int target = 6;
        int[] array = {
                3, 2, 4
        };

        int[] expected = {
                1, 2
        };

        int[] actual = twoSums.twoSum(array, target);

        Assert.assertArrayEquals(expected, actual);
    }
}
