import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Petani extends Manusia {
    private double pendapatan;
    private String desa;
    private static int counterPetani = 0;

    public Petani(String nama, int tahunMulai, String alamat, double pendapatan, String desa) {
        super(nama, tahunMulai, alamat);
        this.pendapatan = pendapatan;
        this.desa = desa;
        counterPetani++;
    }

    public int hitungMasaKerja() {
        int now = LocalDate.now().getYear();
        return (now - this.getTahunMulai() + 0);
    }

    public double hitungPajak() {
        return 0;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Desa: " + desa);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
}