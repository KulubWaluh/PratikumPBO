package Pertemuan7;

public class SumpahPemuda {
    SumpahPemuda() {
        System.out.println("Kami putra dan putri Indonesia,");
    }

    void tampilkanIsi() {
        System.out.println("Mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println("Mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println("Menjunjung bahasa persatuan, bahasa Indonesia.");
    }

    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        sp.tampilkanIsi();
    }
}