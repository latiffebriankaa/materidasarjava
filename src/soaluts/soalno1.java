package soaluts;

import java.util.Scanner;

public class soalno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gaji bulanan dan jam lembur
        System.out.print("Masukkan gaji bulanan: ");
        long gajiBulanan = scanner.nextLong();

        System.out.print("Masukkan jam lembur: ");
        int jamLembur = scanner.nextInt();

        // Menghitung upah lembur per jam
        long upahLemburPerJam = (long) Math.ceil((double) gajiBulanan / 173);

        // Menghitung total upah lembur
        long totalUpahLembur;

        if (jamLembur <= 4) {
            totalUpahLembur = jamLembur * upahLemburPerJam;
        } else {
            long upahLembur4Jam = 4 * upahLemburPerJam;
            int jamLemburTambahan = jamLembur - 4;
            long upahLemburTambahan = jamLemburTambahan * upahLemburPerJam * 2;
            totalUpahLembur = upahLembur4Jam + upahLemburTambahan;
        }

        // Menghitung gaji total
        long gajiTotal = gajiBulanan + totalUpahLembur;

        // Menampilkan hasil
        System.out.println("\nGaji Bulanan: " + gajiBulanan);
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Upah Lembur per Jam: " + upahLemburPerJam);
        System.out.println("Total Upah Lembur: " + totalUpahLembur);
        System.out.println("Gaji Total: " + gajiTotal);

        scanner.close();
    }
}
