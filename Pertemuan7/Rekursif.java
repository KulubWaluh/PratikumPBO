package Pertemuan7;

public class Rekursif {
    void hitungMundur(int angka) {
        if (angka == 0) {
            System.out.println("Mulai!");
            return;
        }
        System.out.println(angka);
        hitungMundur(angka - 1);
    }

    public static void main(String[] args) {
        Rekursif r = new Rekursif();
        r.hitungMundur(5);
    }
}
