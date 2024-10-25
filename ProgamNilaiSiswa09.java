import java.util.ArrayList;
import java.util.Scanner;

public class ProgamNilaiSiswa09 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        //Deklarasi
        String inputNama;
        double inputNilai;
        double totalNilai = 0;
        int jumlahSiswa = 0;
        int siswaDiAtasRataRata = 0;
        int siswaDiBawahRataRata = 0;
        
        // Input data siswa
        while (true) {
            System.out.print("Masukkan nama siswa (atau ketik 'selesai' untuk berhenti): ");
            inputNama = sc.nextLine();
            if (inputNama.equalsIgnoreCase("selesai")) {
                break;
            }
            
            System.out.print("Masukkan nilai siswa: ");
            inputNilai = sc.nextDouble();
            sc.nextLine();
            
            jumlahSiswa++;
            totalNilai += inputNilai;
            
            // Hitung sementara rata-rata dan evaluasi nilai di atas atau di bawah rata-rata
            double rataRataNilai = totalNilai / jumlahSiswa;
            if (inputNilai > rataRataNilai) {
                siswaDiAtasRataRata++;
            } else if (inputNilai < rataRataNilai) {
                siswaDiBawahRataRata++;
            }
        }
        
        if (jumlahSiswa > 0) {
            // Menghitung rata-rata nilai akhir
            double rataRataNilaiAkhir = totalNilai / jumlahSiswa;
            System.out.println(" Rata-rata nilai kelas: " + rataRataNilaiAkhir);
            System.out.println("Jumlah siswa dengan nilai di atas rata-rata: " + siswaDiAtasRataRata);
            System.out.println("Jumlah siswa dengan nilai di bawah rata-rata: " + siswaDiBawahRataRata);
            
            // Menentukan mayoritas siswa yang mendapatkan nilai di atas rata-rata
            if (siswaDiAtasRataRata > jumlahSiswa / 2) {
                System.out.println("Mayoritas siswa mendapatkan nilai di atas rata-rata.");
            } else {
                System.out.println("Mayoritas siswa tidak mendapatkan nilai di atas rata-rata.");
            }
        } else {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
        }
    }
}