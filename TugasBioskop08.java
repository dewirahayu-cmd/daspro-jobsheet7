import java.util.Scanner;
public class TugasBioskop08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jumlahTiket, totalTiket = 0, hargaTiket = 50000;
        int totalSehari = 0, totalHarga = 0;  
        double diskon1 = 0, diskon2 = 0;  
        String namaPelanggan; 

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Masukkan jumlah tiket yang ingin anda beli: ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket < 0) {
                System.out.println("Tidak valid. Tolong masukkan pesanan yang valid ! ");
                sc.nextLine();  
                continue;
            }
            if (jumlahTiket > 10) {
                diskon1 = hargaTiket * 0.15 * jumlahTiket;
                totalHarga = (int)((hargaTiket * jumlahTiket) - diskon1);  
                System.out.println("Selamat! anda mendapatkan diskon sebesar 15%. ");
            } else if (jumlahTiket >= 4 && jumlahTiket <= 10) {  
                diskon2 = hargaTiket * 0.1 * jumlahTiket;
                totalHarga = (int)((hargaTiket * jumlahTiket) - diskon2);  
                System.out.println("Selamat! anda mendapatkan diskon sebesar 10%. ");
            } else {
                totalHarga = hargaTiket * jumlahTiket;
            }
            System.out.println("Total bayar: Rp " + totalHarga);
            totalSehari = totalSehari + totalHarga;
            totalTiket = totalTiket + jumlahTiket;
            sc.nextLine();

        } while (true);
        System.out.println("Total tiket terjual hari ini adalah: " + totalTiket);
        System.out.println("Total pendapatan hari ini: Rp " + totalSehari);
        sc.close();

    }
}