package org.example.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NthSeriesTests {
    NthSeries nthSeries;

    @Before
    public void setUp(){
        nthSeries = new NthSeries();
    }

    @Test
    public void test2_happyPath() {
        int data = 4;

        String expected = "1.25";
        String actual = nthSeries.seriesSum(data);

        Assert.assertEquals(expected, actual);
    }
}
