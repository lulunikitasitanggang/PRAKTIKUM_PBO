import java.time.LocalDate;

class Dosen extends Pegawai {
    private String fakultas;
    private String NID;

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NID) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
        this.NID = NID;
    }

    public String getFakultas() { return fakultas; }
    public String getNID() { return NID; }
}