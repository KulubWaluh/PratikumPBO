package Pertemuan7;

public class TebakLahir {
    void tebak(int bulan, int tanggal){
        int hasil = (((bulan * 2) + 5) * 50) + tanggal - 250;
        System.out.println("Hasil akhir Bulan & Tanggal : " + hasil);
    }
    
    public static void main(String[] args) {
        TebakLahir tl = new TebakLahir();
        tl.tebak(1, 14);
    }
}
