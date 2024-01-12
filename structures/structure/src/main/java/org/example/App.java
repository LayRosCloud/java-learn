package org.example;

import org.example.Tree.BinaryTree;
import org.example.Tree.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.push(5, new Person(1, "Гоша"));
//        binaryTree.push(3, new Person(2, "Гоша"));
//        binaryTree.push(4, new Person(3, "Гоша"));
//        binaryTree.push(2, new Person(4, "Гоша"));
//        binaryTree.push(7, new Person(5, "Гоша"));
//        binaryTree.push(6, new Person(6, "Гоша"));
//        binaryTree.push(8, new Person(7, "Гоша"));
//
//        System.out.println(binaryTree.toString());
//        System.out.println(binaryTree.containsKey(3));
//        System.out.println(binaryTree.containsKey(20));
//        int[] array = new int[100];
//        for (int i = 0; i < 100; i++){
//            array[i] = i;
//        }
//        int searchValue = binarySearch(0, 100, 10, array);
//        System.out.println(searchValue);

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
    }

    private static int binarySearch(int minimum, int maximum, int searchValue, int[] values){
        int middle = (minimum + maximum) / 2;

        if(searchValue == middle){
            return values[middle];
        }else if(middle < searchValue){
            return binarySearch(middle + 1, minimum, searchValue, values);
        }else if (middle > searchValue) {
            return binarySearch(maximum, middle - 1, searchValue, values);
        }

        return -1;
    }
}
