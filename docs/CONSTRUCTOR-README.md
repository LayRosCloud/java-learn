## Конструкторы

Конструктор, если грубо говорить, это метод, который возвращает экземпляр класса, в котором конструктор
написан и инициализирует его поля

Конструкторы имеют следующую форму:
```java
class Person{
    private String name;
    
    public Person(String name){
        this.name = name;
        // тело конструктора
    }
    
}

class Subject{

    public Subject(){
        // тело конструктора
    }

}

Person person = new Person("Гоша");
Subject subject = new Subject();    
```

Как можно заметить конструктор имеет наименование класса, в котором он написан.

Конструктор, если его даже не написать в классе, то он все равно неявно существует

```java
class Person{
    
}

Person person = new Person();
```

Так же конструктор имеет перегрузку как и методы

```java
class Person{
    
    public Person(String firstName, String lastName){
        //тело конструктора
    }
    
    public Person(String firstName){
        //тело конструктора
    }
}
```

Так же конструктор можно вызвать из другого, если логика повторяется с помощью ключевого слова `this`

```java
class Person{
    private String firstName;
    private String lastName;
    
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Person(String firstName){
        //вызов конструктора Person(String firstName, String lastName)
        this(firstName, "Фамилия");
    }

    public Person(){
        this("Имя"); //вызов конструктора Person(String firstName);
        //либо
        this("Имя", "Фамилия"); //вызов конструктора Person(String firstName, String lastName)
    }
}
```

`this` в конструкторе можно вызвать лишь `ОДИН` раз