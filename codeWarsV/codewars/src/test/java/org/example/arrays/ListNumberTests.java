package org.example.arrays;

import org.example.datatypes.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListNumberTests {
    ListNumber number;

    @Before
    public void setUp() {
        number = new ListNumber();
    }

    @Test
    public void testListNode0_happyPath() {
        ListNode listNode = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode1 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode actual = number.addTwoNumbers(listNode, listNode1);
        boolean bv = expected.equals(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testListNode99999_happyPath() {

        ListNode listNode =
                new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9, new ListNode(9))
                                        )
                                )
                        )
                )
        );

        ListNode listNode1 =
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9
                                        )
                                )
                        )
                );


        ListNode expected =
                new ListNode(8,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(0,
                                                        new ListNode(0,
                                                                new ListNode(0, new ListNode(1)))
                                                )
                                        )
                                )
                        )
                );
        ListNode actual = number.addTwoNumbers(listNode, listNode1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testListNode243_happyPath() {
        ListNode listNode = new ListNode(0);
        ListNode listNode1 = new ListNode(0);

        ListNode expected = new ListNode(0);
        ListNode actual = number.addTwoNumbers(listNode, listNode1);

        Assert.assertEquals(expected, actual);
    }
}
