package org.example.arrays;

import org.example.datatypes.ListNode;

public class ListNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tNode = l1;
        StringBuilder array = new StringBuilder();
        StringBuilder array1 = new StringBuilder();
        do{
            array.append(tNode.getValue());
        }while ((tNode = tNode.getNext()) != null);

        tNode = l2;

        do{
            array1.append(tNode.getValue());
        }while ((tNode = tNode.getNext()) != null);

        int value1 = Integer.parseInt(array.toString());
        int value2 = Integer.parseInt(array1.toString());

        StringBuilder builder = new StringBuilder();
        builder.append(value1 + value2);
        builder.reverse();

        String convertedValue = builder.toString();
        ListNode node = new ListNode(Integer.parseInt(convertedValue, 0, 1, Character.MAX_RADIX));
        tNode = node;
        for (int i = 1; i < convertedValue.length(); i++){
            ListNode createdNode = new ListNode(Integer.parseInt(convertedValue, i, i+1, Character.MAX_RADIX));
            tNode.setNext(createdNode);
            tNode = createdNode;
        }


        return node;
    }
}
