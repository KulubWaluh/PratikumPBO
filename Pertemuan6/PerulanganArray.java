package Pertemuan6;

public class PerulanganArray {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        // Perulangan 1: For loop biasa
        System.out.println("Menggunakan for loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        // Perulangan 2: For-each loop
        System.out.println("Menggunakan for-each loop:");
        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}