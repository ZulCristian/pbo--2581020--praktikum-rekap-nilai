import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahSah = 0;
        double total = 0;
        int nilai = 0;

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 kalau sudah selesai.");

        do {
            System.out.print("Nilai ke-" + (jumlahSah + 1) + " : ");

            if (!input.hasNextInt()) {
                System.out.println("  ditolak - masukkan angka bulat");
                input.next();
                continue;
            }
            nilai = input.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("  ditolak - nilai harus 0..100");
                continue;
            }

            char grade;
            if (nilai >= 90) {
                grade = 'A';
            } else if (nilai >= 80) {
                grade = 'B';
            } else if (nilai >= 70) {
                grade = 'C';
            } else if (nilai >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default  -> "Tidak Lulus";
            };

            System.out.println("  Grade " + grade + " — " + keterangan);

            total += nilai;
            jumlahSah++;

        } while (nilai != SELESAI);

        System.out.println();
        if (jumlahSah == 0) {
            System.out.println("Tidak ada nilai sah yang dimasukkan.");
            return;
        }

        double rata = total / jumlahSah;

        String status = rata >= 60 ? "LULUS" : "TIDAK LULUS";

        String rataTeks = String.format("%.2f", rata);

        System.out.println("Nilai sah   : " + jumlahSah);
        System.out.println("Rata-rata   : " + rataTeks);
        System.out.println("Status      : " + status);
    }
}