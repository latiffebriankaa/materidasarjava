package soaluts;

public class soalno2 {
        public static void main(String[] args) {
            int n = 4; // Jumlah baris
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n - i - 1) {
                        System.out.print("S "); // Menampilkan 'S'
                    } else {
                        System.out.print("O "); // Menampilkan 'O'
                    }
                }
                System.out.println(); // Pindah ke baris berikutnya
            }
        }
    }
