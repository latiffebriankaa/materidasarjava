package soaluts;
import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah {
    String nama;
    int sks;
    double nilai;

    MataKuliah(String nama, int sks, double nilai) {
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Mata Kuliah: " + nama + ", SKS: " + sks + ", Nilai: " + nilai;
    }
}

public class soalno3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MataKuliah> mataKuliahList = new ArrayList<>();

        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Masukkan Semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        while (true) {
            System.out.print("Masukkan Nama Mata Kuliah (atau ketik 'selesai' untuk mengakhiri): ");
            String namaMataKuliah = scanner.nextLine();
            if (namaMataKuliah.equalsIgnoreCase("selesai")) {
                break; // Keluar dari loop jika pengguna mengetik 'selesai'
            }

            System.out.print("Masukkan SKS: ");
            int sks = scanner.nextInt();
            System.out.print("Masukkan Nilai: ");
            double nilai = scanner.nextDouble();
            scanner.nextLine(); // Mengonsumsi newline

            mataKuliahList.add(new MataKuliah(namaMataKuliah, sks, nilai));
        }

        // Menampilkan hasil input
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Semester: " + semester);
        System.out.println("Mata Kuliah yang Diambil:");
        for (MataKuliah mk : mataKuliahList) {
            System.out.println(mk);
        }

        scanner.close();
    }
}
