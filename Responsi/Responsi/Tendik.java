import java.text.DecimalFormat;

class Tendik extends Karyawan {
    private static int jumlahTendik = 0;
    private static final double GAJI_POKOK = 4000000;

    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        jumlahTendik++;
    }

    @Override
    public double hitungGaji() {
        return GAJI_POKOK * (1 + masaKerja * 0.01);
    }

    public static int getJumlahTendik() {
        return jumlahTendik;
    }

    @Override
    public void tampilkanInfo() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Tendik: " + nama);
        System.out.println("NIP: " + NIP);
        System.out.println("Email: " + email);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println("Gaji: Rp " + df.format(hitungGaji()));
        System.out.println("Jumlah Tendik: " + getJumlahTendik());
    }
}
