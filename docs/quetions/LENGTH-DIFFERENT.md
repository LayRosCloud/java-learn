## В чем разница между `length()` и `length`?

`length()` - у класса String есть метод length() который возвращает количество символов

`length` - у массивов есть поле length, которое возвращает количество объектов в массиве

```java
String helloWorld = "Hello, World!";
helloWorld.length(); // 10
```

```java
String[] helloWorld = {"Hello", "World!"};
helloWorld.length; // 2
```