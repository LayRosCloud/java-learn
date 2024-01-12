package org.example.Tree;

public class Item {
    private Item left;
    private Item right;
    private final Integer key;
    private Person person;

    public Item(int value, Person person){
        this.key = value;
        this.person = person;
    }

    public Item getLeft() {
        return left;
    }

    public Item getRight() {
        return right;
    }

    public Integer getKey() {
        return key;
    }

    public void setLeft(Item left) {
        this.left = left;
    }

    public void setRight(Item right) {
        this.right = right;
    }

    public void setKey(Integer key, Person person) {
        if(key.equals(getKey())){
            setPerson(person);
        }
        if(key < getKey()){
            if(getLeft() != null){
                getLeft().setKey(key, person);
            }else{
                Item item = new Item(key, person);
                setLeft(item);
            }
        } else if (key > getKey()) {
            if(getRight() != null){

                getRight().setKey(key, person);
            }else{
                Item item = new Item(key, person);
                setRight(item);
            }
        }
    }

    public boolean containsKey(Integer value){

        return findItem(value) != null;
    }

    public Item findItem(Integer value){
        if(value.equals(getKey())){
            return this;
        }
        if(value < getKey()){
            if(getLeft() != null){
                return getLeft().findItem(value);
            }
        } else if (value > getKey()) {
            if(getRight() != null){
                return getRight().findItem(value);
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String valueLeft = getLeft() == null ? "null" : getLeft().toString();
        String valueRight = getRight() == null ? "null" : getRight().toString();
        return "item: " + getKey() + " L-> " + valueLeft + " item: "+ getKey()+" R->" + valueRight + "|\n";
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
