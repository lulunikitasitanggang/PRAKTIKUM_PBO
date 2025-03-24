import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Pengusaha extends Manusia {
    private double pendapatan;
    private String idUsaha;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, int tahunMulai, String alamat, double pendapatan, String idUsaha) {
        super(nama, tahunMulai, alamat);
        this.pendapatan = pendapatan;
        this.idUsaha = idUsaha;
        counterPengusaha++;
    }

    public int hitungMasaKerja() {
        int now = LocalDate.now().getYear();
        int B = Character.getNumericValue(idUsaha.charAt(12));
        return (now - this.getTahunMulai()) + 3;
    }

    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("ID Usaha: " + idUsaha);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
}
