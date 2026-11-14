package Pertemuan6;

public class ThreadTunggal extends Thread {
    @Override
    public void run() {
        System.out.println("Thread baru sedang berjalan.");
    }

    public static void main(String[] args) {
        ThreadTunggal t = new ThreadTunggal();
        t.start();
    }
}