## Перегрузка методов

Overloading methods - означает несколько методов с одинаковым именем у определенного класса, 
но с разными параметрами (аргументами).

**Особенность:** при разных параметрах можно делать разных возвращаемый тип.

Только с помощью перегрузки методов может быть достигнут статический полиморфизм


> Статический полиморфизм - означает, что мы на этапе компиляции уверены метод какого класса будет вызван

Перегрузка методов мы используем тогда, когда нужен схожий функционал, но с разными параметрами

```java
class Person(){
    private double weight;
    
    public void addWeight(int weight){
        this.weight += weight;
    }

    public void addWeight(double weight){
        this.weight += weight;
    }
}

Person person = new Person();

person.addWeight(1); // addWeight(int weight)
person.addWeight(1.0); // addWeight(double weight)
```