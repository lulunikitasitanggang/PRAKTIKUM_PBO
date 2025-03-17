import java.time.LocalDate;

class DosenTamu extends Dosen {
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NID, LocalDate tanggalBerakhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas, NID);
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan        : Dosen Tamu");
        System.out.println("Fakultas       : " + getFakultas());
        System.out.println("NIDK           : " + getNID());
        System.out.println("Tanggal Berakhir Kontrak : " + formatTanggal(tanggalBerakhirKontrak));
    }
}