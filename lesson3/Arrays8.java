package org.example.lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
//положительным, или отрицательным), при этом метод должен сместить все элементы массива
//на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
//вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
//6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
//выбирать сами.
public class Arrays8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int arr1[] = new int [10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = rand.nextInt(30);
        }
        System.out.println("Введите число: ");
        int n = input.nextInt();
        System.out.println(Arrays.toString(arr1));
        mooveArr(arr1, n);
        System.out.println(Arrays.toString(arr1));
    }

    /**
     *
     * @param arr
     * @param n
     */
    public static void mooveArr(int arr[], int n) {
        int temp;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
        if (n < 0) {
            for (int i = 0; i < n*-1; i++) {
                temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
    }
}
