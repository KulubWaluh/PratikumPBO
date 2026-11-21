package Pertemuan7;

import java.util.Scanner;

public class DataMahasiswa {
    String nama, npm, kelas;

    void setData(String nama, String npm, String kelas) {
        this.nama = nama; 
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampilData() {
        System.out.println("\n=== Hasil Input Data ===");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataMahasiswa mhs = new DataMahasiswa();

        System.out.print("Masukkan Nama  : ");
        String inputNama = input.nextLine();
        
        System.out.print("Masukkan NPM   : ");
        String inputNpm = input.nextLine();
        
        System.out.print("Masukkan Kelas : ");
        String inputKelas = input.nextLine();

        mhs.setData(inputNama, inputNpm, inputKelas);
        
        mhs.tampilData();
    }
}