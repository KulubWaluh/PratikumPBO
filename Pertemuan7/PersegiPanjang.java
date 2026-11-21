package Pertemuan7;

public class PersegiPanjang {
    int hitungKeliling(int p, int l){
        return 2 * (p + l);
    }
    
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        int hasil = pp.hitungKeliling(15, 5);
        System.out.println("Keliling : " + hasil);
    }
}
