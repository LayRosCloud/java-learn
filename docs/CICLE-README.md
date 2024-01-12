## Циклы

Порой нужно перебрать массив данных, или выполнить код N раз для этого есть циклы, примеры циклов:

```java
int currentNumber = 0;

while(currentNumber < 3){ //мужской цикл while
    currentNumber++;
}

do{
   currentNumber++; 
}while(currentNumber < 3) //женский цикл do while, выполнится один раз гарантированно
    
for(int index = 0; index < 6; index++){
    currentNumber++;
}

Item[] array = getItems(limit: currentNumber);

for(Item item: array){
    System.out.println(item.toString());    
}
```