package org.example.lesson3;

//7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
//массива равны.
public class Arrays7 {
    public static void main(String[] args) {
        int arr1[] = {2, 2, 2, 1, 2, 2, 10, 1};
        int arr2[] = {2, 2, 2, 2, 2, 2, 10, 1};
        int arr3[] = {1, 1, 1, 2, 1};
        System.out.println(checkBalance2(arr3));
        System.out.println(checkBalance(arr3));

    }

    public static boolean checkBalance2(int _arr[]) {
        int position = _arr.length-1;
        int left = 0;
        int right = 0;
        for (int j = 0; j < _arr.length; j++) {
            for (int i = 0; i < _arr.length; i++) {
                if (i < position) left += _arr[i];
                else right += _arr[i];

            }
            position--;
            System.out.println("left " + left + " rigt " + right + " | pos " + position);
            if (left == right) return true;
            left = 0;
            right = 0;
            if (position == 0) return false;
        }
        return false;
    }

    public static boolean checkBalance(int _arr[]) {
        System.out.println("-----------------");
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < _arr.length; i++) {
            for (int j = 0; j < _arr.length - i; j++) {
                leftSum += _arr[j];
            }
            System.out.print("left = " + leftSum);

            for (int k = _arr.length; k > _arr.length - i; k--) {
                rightSum += _arr[k - 1];
            }
            System.out.println(" right = " + rightSum);

            if (leftSum == rightSum) return true;
            leftSum = 0;
            rightSum = 0;
        }
        return false;
    }
}
