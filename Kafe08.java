import java.util.Scanner;

public class Kafe08 {
    static Scanner sc = new Scanner(System.in);
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("==== MENU RESTO CAFE ====");
        System.out.println("1. Kopi Hitam - Rp. 15,000");
        System.out.println("2. Cappucino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh Tarik - Rp. 12,000");
        System.out.println("5. Roti Bakar - Rp. 10,000");
        System.out.println("6. Mie Goreng - Rp. 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }
    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem) {
        int[] harga = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = harga[pilihanMenu - 1] * banyakItem;

        return hargaTotal;
    }

    public static void main(String[] args) {

        Menu("Budi", false);

        System.out.print("\nMasukkan nomor menu : ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah pesanan : ");
        int banyakItem = sc.nextInt();

        int totalBayar = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);

        System.out.println("---------------------------");
        System.out.println("Total Bayar = Rp" + totalBayar);
    }
    
}
