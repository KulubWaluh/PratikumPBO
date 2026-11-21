package Pertemuan7;

class Civitas {
    String nama;
    String status;

    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Status: " + status + " Fakultas Teknik");
    }
}

class Dosen extends Civitas {}
class Mahasiswa extends Civitas {}
class Staff extends Civitas {}

public class MainCivitas {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        d.nama = "Pa Zakay";
        d.status = "Dosen";
        d.tampilInfo();

        Mahasiswa m = new Mahasiswa();
        m.nama = "Andika";
        m.status = "Mahasiswa";
        m.tampilInfo();

        Staff s = new Staff();
        s.nama = "Mang Alex";
        s.status = "Staff";
        s.tampilInfo();
    }
}