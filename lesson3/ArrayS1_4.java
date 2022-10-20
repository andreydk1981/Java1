package org.example.lesson3;

import java.util.Arrays;

public class ArrayS1_4 {
    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
        //0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int intarray[] = {1, 0, 0, 0, 1, 1, 1, 0, 1};
        for (int i = 0; i < intarray.length; i++) {
            if (intarray[i] == 1) intarray[i] = 0;
            else intarray[i] = 1;
        }
        System.out.println(Arrays.toString(intarray));

        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
        //значениями 1 2 3 4 5 6 7 8 … 100;
        int arr2[] = new int[100];
        for (int i = 1; i <= arr2.length; i++) {
            arr2[i - 1] = i;
        }
        System.out.println(Arrays.toString(arr2));
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
        //умножить на 2;
        int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
        }
        System.out.println(Arrays.toString(arr3));

        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        //(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
        //диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
        //[1][1], [2][2], …, [n][n];
        int arr4[][] = new int[5][5];
        int last = arr4[0].length - 1;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) arr4[i][j] = 1;
                else if (j == last) arr4[i][j] = 1;
                else arr4[i][j] = 0;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
            last--;
        }


    }
}
