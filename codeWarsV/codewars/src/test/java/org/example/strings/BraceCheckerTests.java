package org.example.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BraceCheckerTests {
    private BraceChecker braceChecker;

    @Before
    public void setUp(){
        braceChecker = new BraceChecker();
    }

    @Test
    public void isValidGoodBraces_happyPath() {
        String data = "{([])}";

        boolean expected = true;
        boolean actual = braceChecker.isValid(data);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isValidBadBraces_happyPath() {
        String data = "{([]}}";

        boolean expected = false;
        boolean actual = braceChecker.isValid(data);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isValidCloseBraces_happyPath() {
        String data = "))))}}}}}]]]]]";

        boolean expected = false;
        boolean actual = braceChecker.isValid(data);

        Assert.assertEquals(expected, actual);
    }
}
