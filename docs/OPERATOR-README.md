## Операторы для работы с литералами и переменными

> **Литерал** - это фиксированное значение в программном коде "Hello, World!" и 1,2,3

**Пример кода:**
```java
int number = 1;

number = number + 2;
number = number - 2;
number = number * 2;
number = number / 2;

//так же есть сокращенная версия

number += 2; //number = number + 2;
number -= 2; //number = number - 2;
number *= 2; //number = number * 2;
number /= 2; //number = number / 2;
```

Существует так же **инкремент** (инкрементирование) и **декремент**

**Пример кода:**
```java
int number = 1;
number++; //инкремент number = number + 1;
number--; //декремент number = number - 1;
```

Так же есть оператор, который находит остаток от деления 

**Пример кода:**
```java
int number = 10;
number = number % 2; // 0
number = 10;
number = number % 3; // 1
```