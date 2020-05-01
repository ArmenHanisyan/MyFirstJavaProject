package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] array5 = new int[4][4];
        for (int i = 0; i< array5.length; i++) {
            for (int j = 0; j< array5[i].length; j++) {
                array5[i][j] = (i + j) * 100;
                System.out.print(array5[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(getMaxFromArray(array5));
    }

    private static int getMaxFromArray(int[][] array) {
        if (array.length == 0) return 0;
        int max = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        return max;
    }

    private static int getMaxFromArray(int[] array) {
        if (array.length == 0) return 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
