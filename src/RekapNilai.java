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
    }
}