import java.util.Scanner;

public class Siakad26 {

    public static void main(String[] args) {
        // deklarasi variable
        String nama, nim, kelas, kualifikasi, nilaiHuruf;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiakhir;

        // membuat scanner baru
        Scanner sc = new Scanner(System.in);

        // Tampilan output ke user
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiakhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiakhir >80 && nilaiakhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiakhir > 73 && nilaiakhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih Dari Baik";
        } else if (nilaiakhir > 65 && nilaiakhir <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiakhir > 60 && nilaiakhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih Dari Cukup";
        } else if (nilaiakhir > 50 && nilaiakhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiakhir > 39 && nilaiakhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }  else if (nilaiakhir <= 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        } else {
            nilaiHuruf = "tidak teridentifikasi";
            kualifikasi = "tidak teridentifikasi";
        }
        
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM: " + nim + ") " + "kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir       : " + nilaiakhir);
        System.out.println("Nilai akhir huruf : " + nilaiHuruf);
        System.out.println("Kualifikasi       : " + kualifikasi);

    }
}