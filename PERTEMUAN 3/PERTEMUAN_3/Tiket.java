/* Nama     : Lulu Nikita Sitanggang
 * NIM      : 24060123120032
*/

public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket) {
        int tiketTersedia = 100;

        assert jumlahTiket > 0 : "Jumlah pemesanan harus lebih dari 0";
        assert jumlahTiket <= tiketTersedia : "Jumlah pemesanan tidak boleh melebihi tiket yang tersedia";

        if (jumlahTiket > tiketTersedia) {
            System.out.println("Jumlah pemesanan tidak boleh melebihi tiket yang tersedia. Program dihentikan.");
            System.exit(1);
        }

        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

    public static void isEWallet(int EWallet) {
        assert EWallet >= 1 && EWallet <= 4 : "Pilihan e-wallet tidak valid";
        
        if (EWallet < 1 || EWallet > 4) {
            System.out.println("Pilihan e-wallet tidak valid. Program dihentikan.");
            System.exit(1);
        }
        
        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

    private static String getEWallet(int index) {
        switch (index) {
            case 1:
                return "OVO";
            case 2:
                return "GoPay";
            case 3:
                return "DANA";
            case 4:
                return "LinkAja";
            default:
                return "";
        }
    }
}
