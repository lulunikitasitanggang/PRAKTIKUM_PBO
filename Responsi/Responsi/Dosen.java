import java.text.DecimalFormat;

class Dosen extends Karyawan {
    private static int jumlahDosen = 0;
    private Fakultas fakultas;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        jumlahDosen++;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() * (1 + masaKerja * 0.01);
    }

    public static int getJumlahDosen() {
        return jumlahDosen;
    }

    @Override
    public void tampilkanInfo() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Dosen: " + nama);
        System.out.println("NIP: " + NIP);
        System.out.println("Email: " + email);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println("Gaji: Rp " + df.format(hitungGaji()));
        System.out.println("Jumlah Dosen: " + getJumlahDosen());
    }
}