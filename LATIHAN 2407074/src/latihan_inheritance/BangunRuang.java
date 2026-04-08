package latihan_inheritance;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); 
        this.tinggi = tinggi;
    }

    // method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}