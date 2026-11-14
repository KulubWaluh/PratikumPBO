package Pertemuan6;

import java.util.Arrays;

public class SintaksArray {
    public static void main(String[] args) {

        int[] array1 = new int[5];

        int array2[];
        array2 = new int[5];

        int[] array3 = {10, 20, 30, 40, 50};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
    }
}