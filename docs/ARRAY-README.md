## Массивы

Если нужно хранить огромное количество данных одного типа, для этого существуют массивы данных. 
Массивы являются ссылочным типом

> Ссылочный тип - это тип у которого есть адрес в ячейке и когда мы пишем подобный код: `obj = otherObject`
> то мы не передаем значение этого объекта, а передаем ссылку на него и когда мы будем изменять obj, мы 
> будем изменять и otherObject

```java
int[] array = new int[10];

int[] array = {
        1, 2, 3, 4, 5
        };

int[] array = new int[] {
        1, 2, 3, 4, 5
        };

```

Двумерный и более массив в Java больше похож на зубчатый из яп C#, который состоит из отдельных массивов, поэтому
и работать с ним стоит соответствующе, можно сделать следующие реализации:

```java
final int size = 7;

String[][] array = new String[size][];

for (int row = 0; row < array.length; row++){
    array[row] = new String[new Random().nextInt(10, 100)];
    for (int column = 0; column < array[row].length; column++){
        array[row][column] = "0";
        System.out.print(array[row][column]);
    }
    System.out.println();
}

String[][] array = new String[size][size];

for (int row = 0; row < array.length; row++){
        for (int column = 0; column < array[row].length; column++){
            array[row][column] = "0";
            System.out.print(array[row][column]);
        }
    System.out.println();
}
```