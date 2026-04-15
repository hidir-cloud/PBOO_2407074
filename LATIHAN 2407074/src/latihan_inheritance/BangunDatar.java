package latihan_inheritance;

public class BangunDatar {
    // atribut private (enkapsulasi)
    private double panjang;
    private double lebar;

    // constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter untuk panjang
    public double getPanjang() {
        return panjang;
    }

    // getter untuk lebar
    public double getLebar() {
        return lebar;
    }

    // method
    public double hitungLuas() {
        return panjang * lebar * 2;
    }
}