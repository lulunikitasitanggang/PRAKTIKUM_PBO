import java.text.DecimalFormat;

class Mahasiswa extends CivitasAkademika {
    private static int jumlahMahasiswa = 0;
    private String NIM;
    private int semester;
    private Fakultas fakultas;

    public Mahasiswa( String nama, String email, String NIM, int semester, Fakultas fakultas) {
    super(nama, email);
    this.NIM = NIM;
    this.semester = semester;
    this.fakultas = fakultas;
    jumlahMahasiswa++;
    }

    public double hitungUKT(){
        return fakultas.getTarifUKT() * Math.pow(0.95, semester-1);
    }

    public static int getJumlahMahasiswa(){
        return jumlahMahasiswa;
    }

    @Override
    public void tampilkanInfo(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Mahasiswa: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Email: " + email);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Semester: " + semester);
        System.out.println("Biaya UKT: Rp " + df.format(hitungUKT()));
        System.out.println("Jumlah Mahasiswa: " + getJumlahMahasiswa());
    }
}