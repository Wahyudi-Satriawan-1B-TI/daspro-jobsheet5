import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    int usia;
    String kategori;

    System.out.print("Masukkan umur: ");
        usia = input.nextInt();

        if (usia > 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 19 && usia <= 13) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else if (usia >= 65) {
            kategori = "Lansia";
        } else {
            kategori = "invalid";
        }

    System.out.println("Anda masuk kategori " + kategori);

    }
}