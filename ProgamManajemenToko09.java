import java.util.Scanner;

public class ProgamManajemenToko09 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Deklarasi
        String namaBarang;
        int stokBarang;
        double hargaPerUnit;
        int permintaanBarang;
        String inputUser;

        while (true) {
            // Input Data Barang
            System.out.print("Masukkan nama barang (atau ketik 'selesai' untuk menghentikan program): ");
            namaBarang = sc.nextLine();
            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok barang: ");
            stokBarang = sc.nextInt();

            System.out.print("Masukkan harga per unit barang: ");
            hargaPerUnit = sc.nextDouble();

            // Menghitung Total Nilai Stok
            double totalNilaiStok = stokBarang * hargaPerUnit;
            System.out.println("Total nilai stok: " + totalNilaiStok);

            // Memproses Permintaan Barang
            System.out.print("Masukkan jumlah permintaan barang: ");
            permintaanBarang = sc.nextInt();

            // Mengecek permintaan yang bisa dipenuhi
            if (permintaanBarang <= stokBarang) {
                stokBarang -= permintaanBarang;
                System.out.println("Permintaan dapat dipenuhi. Stok barang sekarang: " + stokBarang);
            } else {
                System.out.println("Permintaan tidak dapat dipenuhi. Stok barang tidak mencukupi.");
            }

            // Menampilkan Informasi Barang Setelah Proses
            System.out.println("===Informasi Barang===");
            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Stok Tersisa: " + stokBarang);
            System.out.println("Total Nilai Stok: " + (stokBarang * hargaPerUnit));

            // Membaca newline yang tersisa setelah input integer
            sc.nextLine();
        }
        System.out.println("Program telah berhenti.");
    }
}
