package latihan_1;

class Cafe {
    String nama;
    String alamat;
    
    Cafe(String nama, String alamat) {
        this.nama = nama; 
        this.alamat = alamat;
        System.out.println("Cafe Terdaftar:");
        System.out.println("Nama Cafe: " + this.nama);
        System.out.println("Alamat Cafe di: " + this.alamat);
        System.out.println("==============================");
    }

    void buka() {
        System.out.println("Cafe " + nama + " Sudah Buka Nih!");
    }
}

public class Main {
     public static void main(String[] args) { // Harus 'main' (huruf kecil)
        Cafe cafe1 = new Cafe("CoffeYou", "Jl.Ahmad Yani");
        Cafe cafe2 = new Cafe("Teringat Kopi", "Jl. Terusan");
        Cafe cafe3 = new Cafe("Nescafe", "Jl. Siliwangi");
        
        System.out.println("\n--- Status Operasional ---");
        cafe1.buka();
        cafe2.buka();
        cafe3.buka();
    }
}
