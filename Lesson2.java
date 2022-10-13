package org.example;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(tesmSumm(20, 5));
        testOddOrEven(10);
        testOddOrEven(11);
        System.out.println(isNegative(-5));
        System.out.println(isNegative(5));
        printStr("qwerty", 3);
        for (int i = 0; i < 2022 ; i+=4) {
            System.out.println("Is " + i + " Leap? " + isLeap(i));
        }

    }

    /**
     * проверка входил ли сумма в интервал
     * @param a
     * @param b
     * @return
     */
    private static boolean tesmSumm(int a, int b) {
        if (a + b < 10 || a + b > 20) return false;
        else return true;
    }

    private static void testOddOrEven(int a) {
        if (a % 2 == 0) System.out.println("четное");
        else System.out.println("нечетное");
    }

    private static boolean isNegative(int a) {
        if (a < 0) return true;
        else return false;
    }

    private static void printStr(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    private static boolean isLeap(int a) {
        if (a % 400 == 0) return true;
        if (a % 4 == 0 && a % 100 != 0) return true;
        return false;
    }
}