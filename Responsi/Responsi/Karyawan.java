abstract class Karyawan extends CivitasAkademika {
    protected static int jumlahKaryawan = 0;
    protected String NIP;
    protected int masaKerja;

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
        jumlahKaryawan++;
    }

    public abstract double hitungGaji();
}