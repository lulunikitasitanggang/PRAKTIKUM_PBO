import java.time.LocalDate;

class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() { return bidang; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan        : Tendik");
        System.out.println("Bidang         : " + bidang);
    }
}