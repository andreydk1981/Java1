package org.example.lesson3;
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class Arrays6 {
    public static void main(String[] args) {
    int arr[] = {2,4,5,57,2,25,63,8856,2,5,6,336,6,3,2423};
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("min = " + min + " max = " + max);
    }
}
