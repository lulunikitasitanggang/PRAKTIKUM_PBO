import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PNS extends Manusia {
    private double pendapatan;
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, int tahunMulai, String alamat, double pendapatan, String nip) {
        super(nama, tahunMulai, alamat);
        this.pendapatan = pendapatan;
        this.nip = nip;
        counterPNS++;
    }

    public int hitungMasaKerja() {
        int now = LocalDate.now().getYear();
        int A = Character.getNumericValue(nip.charAt(13));
        return (now - this.getTahunMulai()) + 2;
    }

    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIP: " + nip);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
}
