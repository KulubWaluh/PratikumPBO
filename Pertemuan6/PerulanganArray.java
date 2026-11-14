package Pertemuan6;

public class PerulanganArray {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menggunakan for loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("Menggunakan for-each loop:");
        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}