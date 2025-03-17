import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() { 
        return NIP;
    }

    public String getNama() { 
        return nama; 
    }

    public LocalDate getTanggalLahir() { 
        return tanggalLahir; 
    }

    public LocalDate getTMT() { 
        return TMT; 
    }
    
    public double getGajiPokok() { 
        return gajiPokok; 
    }
    
    public String formatTanggal(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
    }

    public String hitungMasaKerja() {
        long tahun = ChronoUnit.YEARS.between(TMT, LocalDate.now());
        long bulan = ChronoUnit.MONTHS.between(TMT.plusYears(tahun), LocalDate.now());
        return tahun + " tahun " + bulan + " bulan";
    }

    public double hitungTunjangan() {
        return 0;
    }

    public void printInfo() {
        System.out.println("NIP            : " + NIP);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + formatTanggal(tanggalLahir));
        System.out.println("TMT            : " + formatTanggal(TMT));
        System.out.println("Gaji Pokok     : Rp " + String.format("%,.2f", gajiPokok));
    }
}