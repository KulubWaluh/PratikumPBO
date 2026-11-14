package Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RataRataBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = input.nextInt();
            double[] bilangan = new double[n];
            double total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                bilangan[i] = input.nextDouble();
                total += bilangan[i];
            }

            double rataRata = total / n;
            System.out.println("Nilai rata-rata: " + rataRata);

        } catch (InputMismatchException e) {
            System.out.println("Error: Input yang dimasukkan bukan bilangan!");
        }
    }
}