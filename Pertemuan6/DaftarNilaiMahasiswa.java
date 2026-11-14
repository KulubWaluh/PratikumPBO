package Pertemuan6;

import java.util.Scanner;

public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine();

            if (nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }

        System.out.println("\n               Daftar Nilai Mahasiswa");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-8s %-25s %-12s %-15s\n", "No", "Nama", "Nilai", "Status");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-8d %-25s %-12d %-15s\n", (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println("------------------------------------------------------------");
    }
}