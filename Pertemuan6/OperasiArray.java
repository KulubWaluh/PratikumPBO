package Pertemuan6;

import java.util.Arrays;
import java.util.Scanner;

public class OperasiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen indeks ke-" + i + ": ");
            arr[i] = input.nextInt();
        }

        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
        }
        System.out.println("Nilai terbesar: " + max + " pada indeks ke-" + idxMax);
        System.out.println("Nilai terkecil: " + min + " pada indeks ke-" + idxMin);

        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        double rataRata = (double) total / n;
        System.out.println("Total semua data: " + total);
        System.out.println("Rata-rata: " + rataRata);

        int jumlahIndeksGenap = 0;
        for (int i = 0; i < n; i += 2) {
            jumlahIndeksGenap += arr[i];
        }
        System.out.println("Jumlah elemen indeks genap: " + jumlahIndeksGenap);

        if (jumlahIndeksGenap % 2 == 0) {
            System.out.println("Hasil penjumlahan bernilai Genap");
        } else {
            System.out.println("Hasil penjumlahan bernilai Ganjil");
        }

        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
    }
}