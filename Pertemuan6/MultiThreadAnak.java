package Pertemuan6;

import java.util.Scanner;

public class MultiThreadAnak extends Thread {
    private int nomorThread;

    public MultiThreadAnak(int nomorThread) {
        this.nomorThread = nomorThread;
    }

    @Override
    public void run() {
        System.out.println("Thread anak ke-" + nomorThread + " sedang berjalan.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah thread yang diinginkan: ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            MultiThreadAnak t = new MultiThreadAnak(i);
            t.start();
        }
    }
}