package org.example.datatypes;

public class ListNode {
    private int value;



    private ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.value = val; }
    public ListNode(int val, ListNode next) { this.value = val; this.next = next; }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public ListNode getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ListNode node){
            if(next != null){
                return value == node.value && node.next.equals(next);
            }
            return value == node.getValue();
        }
        return false;
    }
}
