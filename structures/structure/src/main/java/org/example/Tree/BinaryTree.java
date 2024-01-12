package org.example.Tree;

public class BinaryTree {
    private Item item;
    public BinaryTree(){
    }
    public void push(Integer key, Person person){
        if(item == null){
            item = new Item(key, person);
        }
        item.setKey(key, person);
    }

    public Boolean containsKey(Integer value){
        return item.containsKey(value);
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
