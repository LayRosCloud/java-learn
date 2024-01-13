package org.example.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayHelper {
    //my release
    public int[] divide(int[] divided, int[] divider){ // алгоритм доведен до статуса (O), но есть перерасход памяти
        List<Integer> array = new ArrayList<Integer>();// только с определенной версии Java, можно не писать тип данных в <>

        Map<Integer, Integer> dividedMap = new HashMap<Integer,Integer>();//пропустил точку с запятой

        for(int item: divider){
            dividedMap.put(item, item); // вместо add используется метод put
        }

        for(int item: divided){
            if(!dividedMap.containsKey(item)){
                array.add(item);
            }
        }

        //Поработать над преобразованиями массивов
        int[] result = new int[array.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = array.get(i);
        }

        return result;
    }

    public int[] divide_bestPractice(int[] divided, int[] divider){
        List<Integer> dividedList = Arrays.stream(divided)//возвращает IntStream
                .boxed()//конвертируем в Stream<Integer>
                .collect(Collectors.toList());//Конвертируем в List

        List<Integer> dividerList = Arrays.stream(divider)
                .boxed()
                .collect(Collectors.toList());

        dividedList.removeAll(dividerList); //удаляем весь список...
        return dividedList.stream().mapToInt(x -> x).toArray();
    }
}
