package org.example.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CrossesZeroes {
    public static final int AI = 0;
    public static final int HUMAN = 1;
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final char DOT_EMPTY = '*';
    public static Scanner input = new Scanner(System.in);
    public static char[][] map;
    public static int[] lineMap;

    public static int[] blockCoordinates;
    public static int size = 0;

    public static int mapSizeEnter() {
        System.out.println("Input map size: ");
        return input.nextInt();
    }

    public static void initMap() {
        size = mapSizeEnter();
        map = new char[size][size];
        lineMap = new int[size];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                map[y][x] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        // print X numbers
        for (int x = 0; x <= size; x++) {
            System.out.print(x + " ");
        }
        System.out.println("X");
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + " ");// print Y numbers
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Y");
    }

    public static boolean inputOk(int x, int y, int player) {
        if (x > size - 1 || y > size - 1 || x < 0 || y < 0) {
            if (player == HUMAN) {
                System.out.println("Input OVERSIZE! Try again!");
                printMap();
            }
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            if (player == HUMAN) {
                System.out.println("Dot busy! Try again!");
                printMap();
            }
            return false;
        }
        return true;
    }

    public static void humanTurn() {
        //Random rnd = new Random();
        int x, y;
        do {
            System.out.println("Input coordinates x y:");
            x = input.nextInt() - 1;
            y = input.nextInt() - 1;
            //x = rnd.nextInt(size);
            //y = rnd.nextInt(size);
        } while (!inputOk(x, y, HUMAN));
        System.out.printf("x = %d, y = %d\n", x + 1, y + 1);
        map[y][x] = DOT_X;
    }

    public static boolean searchLinesToBlock() {
        int maxCont = size / 2 + 1;
        int count = 0;
        Arrays.fill(lineMap, 0);
        blockCoordinates = new int[2];
        // horizontal
        for (int y = 0; y < size; y++) {
            blockCoordinates[1] = y;
            for (int x = 0; x < size; x++) { // find line
                if (map[y][x] == DOT_X) {
                    lineMap[x] = 1;
                    count++;
                }
                if (map[y][x] == DOT_0) {
                    lineMap[x] = 2;
                }
            }
            //System.out.print("count = " + count);
            //System.out.println(Arrays.toString(lineMap));
            if (count >= maxCont) {
                for (int i = 0; i < size; i++) { // find free dot to block
                    if (lineMap[i] == 0) {
                        blockCoordinates[0] = i;
                        return true;
                    }
                }
            }
            count = 0;
            Arrays.fill(lineMap, 0);
        }
        // vertical
        for (int x = 0; x < size; x++) {
            blockCoordinates[0] = x;
            for (int y = 0; y < size; y++) { // find line
                if (map[y][x] == DOT_X) {
                    lineMap[y] = 1;
                    count++;
                }
                if (map[y][x] == DOT_0) {
                    lineMap[y] = 2;
                }
            }
            //System.out.print("count = " + count);
            //System.out.println(Arrays.toString(lineMap));
            if (count >= maxCont) {
                for (int i = 0; i < size; i++) { // find free dot to block
                    if (lineMap[i] == 0) {
                        blockCoordinates[1] = i;
                        return true;
                    }
                }
            }
            count = 0;
            Arrays.fill(lineMap, 0);
        }

        return false;
    }

    public static void aiTurn() {
        System.out.println("Computer turn:");

        Random rnd = new Random();
        int x, y;
        if (searchLinesToBlock()) {
            System.out.printf("BLOCK! in x=%d y=%d\n", blockCoordinates[0] + 1, blockCoordinates[1] + 1);
            x = blockCoordinates[0];
            y = blockCoordinates[1];
        } else
            do {
                x = rnd.nextInt(size);
                y = rnd.nextInt(size);
            } while (!inputOk(x, y, AI));
        System.out.printf("x = %d, y = %d\n", x + 1, y + 1);
        map[y][x] = DOT_0;
    }

    public static boolean mapHaveEmptyDot() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean winCheck() {
        int winDotsHuman = 0;
        int winDotsAI = 0;
        // test horizontal
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (map[y][x] == DOT_X) {
                    winDotsHuman++;
                }
                if (map[y][x] == DOT_0) {
                    winDotsAI++;
                }
            }
            if (winDotsHuman == size || winDotsAI == size) {
                System.out.printf("Horizontal %d!\n", y + 1);
                System.out.printf("%s WIN!", winDotsHuman > winDotsAI ? "Human" : "Computer");
                return true;
            }
            winDotsHuman = 0;
            winDotsAI = 0;
        }


        // test vertical
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (map[x][y] == DOT_X) {
                    winDotsHuman++;
                }
                if (map[x][y] == DOT_0) {
                    winDotsAI++;
                }
            }
            if (winDotsHuman == size || winDotsAI == size) {
                System.out.printf("Vertical %d!\n", y + 1);
                System.out.printf("%s WIN!", winDotsHuman > winDotsAI ? "Human" : "Computer");
                return true;
            }
            winDotsHuman = 0;
            winDotsAI = 0;
        }


        // test diagonal
        for (int x = 0; x < size; x++) {
            if (map[x][x] == DOT_X) {
                winDotsHuman++;
            }
            if (map[x][x] == DOT_0) {
                winDotsAI++;
            }
        }
        if (winDotsHuman == size || winDotsAI == size) {
            System.out.printf("Diagonal 0-%d!\n", size);
            System.out.printf("%s WIN!", winDotsHuman > winDotsAI ? "Human" : "Computer");
            return true;
        }
        winDotsHuman = 0;
        winDotsAI = 0;

        for (int x = size - 1; x >= 0; x--) {
            if (map[x][size - 1 - x] == DOT_X) {
                winDotsHuman++;
            }
            if (map[x][size - 1 - x] == DOT_0) {
                winDotsAI++;
            }
        }
        if (winDotsHuman == size || winDotsAI == size) {
            System.out.printf("Diagonal %d-%d!\n", size, size);
            System.out.printf("%s WIN!", winDotsHuman > winDotsAI ? "Human" : "Computer");
            return true;
        }
        // test draw game
        if (!mapHaveEmptyDot()) {
            System.out.println("Game Over");
            System.out.println("NO Winner!");
            return true;
        }

        return false;
    }

    public static void playGame() {
        initMap();
        printMap();
        do {
            humanTurn();
            printMap();
            if (winCheck()) break;
            aiTurn();
            printMap();
        } while (!winCheck());

    }

    public static void main(String[] args) {
        playGame();
    }
}
