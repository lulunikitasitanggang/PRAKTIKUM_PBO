import java.time.LocalDate;

abstract class Manusia {
    protected String nama;
    protected int tahunMulai;
    protected String alamat;
    private static int counterMns = 0;

    public Manusia(String nama, int tahunMulai, String alamat) {
        this.nama = nama;
        this.tahunMulai = tahunMulai;
        this.alamat = alamat;
        counterMns++;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTahunMulai() {
        return tahunMulai;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public abstract double hitungPajak();
    public abstract int hitungMasaKerja();
    public abstract void cetakInfo();
}
