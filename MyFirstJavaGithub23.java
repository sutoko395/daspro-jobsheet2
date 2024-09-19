import java.util.Scanner;

/**
 * MyFirstJavaGithub23
 */
public class MyFirstJavaGithub23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jam = 50000, kehadiran, gaji_harian, gaji_bulanan;

        System.out.println("Masukkan jam kerja anda : ");
        jam = sc.nextInt();
        System.out.println("Masukkan kehadiran anda dalam satu bulan : ");
        kehadiran = sc.nextInt();

        gaji_harian = jam * 50000;
        gaji_bulanan = gaji_harian * kehadiran;

        System.out.println("===SELAMAT===");
        System.out.println("Gaji anda telah telah cair sebesar: Rp." +gaji_bulanan);
        System.out.println("Terima Kasih atas kerjasamanya dalam membangun perusahaan ini");
        System.out.println("Sampai jumpa ditransaksi berikutnya");
        System.out.println("===See Yuou Next Time===");

    }
}