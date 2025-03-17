import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class DosenTetap extends Dosen {
    private LocalDate BUP;

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NID) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas, NID);
        this.BUP = tanggalLahir.plusYears(65);
    }

    public String getBUP() { return formatTanggal(BUP); }

    @Override
    public double hitungTunjangan() {
        return 0.02 * ChronoUnit.YEARS.between(getTMT(), LocalDate.now()) * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan        : Dosen Tetap");
        System.out.println("Fakultas       : " + getFakultas());
        System.out.println("NIDN           : " + getNID());
        System.out.println("Masa Kerja     : " + hitungMasaKerja());
        System.out.println("BUP            : " + getBUP());
        System.out.println("Tunjangan      : 2% x " + ChronoUnit.YEARS.between(getTMT(), LocalDate.now()) + " x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}
