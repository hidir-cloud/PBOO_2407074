package latihan_inheritance;

public class Main {
    public static void main(String[] args) {

        // membuat objek dengan data soal
        BangunRuang br = new BangunRuang(10, 5, 4);

        // menampilkan luas
        System.out.println("Luas Alas: " + br.hitungLuas());

        // menampilkan volume
        System.out.println("Volume: " + br.hitungVolume());
    }
}