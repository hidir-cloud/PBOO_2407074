package latihan_4;

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih Bangun Datar:");
        System.out.println("1. Persegi\n2. Segitiga\n3. Persegi Panjang\n4. Lingkaran");
        System.out.print("Pilihan: ");
        int menu = input.nextInt();

        if (menu == 1) {
            persegi p = new persegi();
            System.out.print("Masukkan Sisi: ");
            p.setSisi(input.nextDouble()); 
            System.out.println("Luas: " + p.hitungLuas());
            System.out.println("Keliling: " + p.hitungKeliling());

        } else if (menu == 2) {
            segitiga s = new segitiga();
            System.out.print("Masukkan Alas: ");
            s.setLebar(input.nextDouble()); 
            System.out.print("Masukkan Tinggi: ");
            s.setTinggi(input.nextDouble());
            System.out.println("Luas: " + s.hitungLuas());
            System.out.println("Keliling: " + s.hitungKeliling());

        } else if (menu == 3) {
            System.out.println("Fitur Persegi Panjang belum dibuat.");

        } else if (menu == 4) {
            lingkaran l = new lingkaran();
            System.out.print("Masukkan Jari-jari: ");
            l.setJari_jari(input.nextDouble()); 
            System.out.println("Hasil Luas Lingkaran: " + l.hitungLuas());
            System.out.println("Hasil Keliling Lingkaran: " + l.hitungKeliling());
        }
        
        input.close();
    }
}
