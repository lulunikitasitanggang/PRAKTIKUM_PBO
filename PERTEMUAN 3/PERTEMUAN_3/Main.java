/* Nama     : Lulu Nikita Sitanggang
 * NIM      : 24060123120032
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi menu
        Menu menu1 = new Menu("Nasi Goreng", 25000, 10);
        Menu menu2 = new Menu("Mie Ayam", 20000, 15);

        Scanner scanner = new Scanner(System.in);

        // Interaksi dengan pengguna
        System.out.println("Menu:");
        System.out.println("1. Nasi Goreng - Rp25000");
        System.out.println("2. Mie Ayam - Rp20000");

        try {
            // Meminta input dari pengguna
            System.out.print("Pilih menu (1/2): ");
            int pilihanMenu = scanner.nextInt();

            if (pilihanMenu != 1 && pilihanMenu != 2) {
                throw new MenuTidakTersediaException("Menu tidak valid");
            }

            System.out.print("Jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();

            // Menentukan menu yang dipilih
            Menu menu = (pilihanMenu == 1) ? menu1 : menu2;
            
            // Periksa apakah menu yang dipilih tidak null
            if (menu == null) {
                throw new MenuTidakTersediaException("Menu tidak tersedia");
            }

            // Memeriksa apakah stok mencukupi
            if (jumlahPesanan > menu.getStok()) {
                throw new JumlahPesananMelebihiStokException("Jumlah pesanan melebihi stok yang tersedia");
            }

            // Melakukan pemesanan
            Pesanan pesanan = new Pesanan(menu, jumlahPesanan);
            menu.kurangiStok(jumlahPesanan);

            System.out.println("Pesanan berhasil dilakukan.");
            System.out.println("Total harga: Rp" + pesanan.getTotal());

        } catch (MenuTidakTersediaException | JumlahPesananMelebihiStokException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan angka yang sesuai.");
        } finally {
            scanner.close();
        }
    }
}
