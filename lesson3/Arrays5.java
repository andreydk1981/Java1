package org.example.lesson3;

import java.util.Arrays;

//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
//одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
public class Arrays5 {
    public static void main(String[] args) {
        int len = 10;
        int initialValue = 5;
        System.out.println(Arrays.toString(arrFill(len, initialValue)));

    }

    public static int[] arrFill (int _len, int _initVal){
        int arr[] = new int [_len];
        for (int i = 0; i < _len; i++) {
            arr[i] = _initVal;
        }
        return arr;
    }
}

