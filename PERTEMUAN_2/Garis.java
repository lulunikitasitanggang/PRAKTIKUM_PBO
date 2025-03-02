/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Lulu Nikita Sitanggang
 * Tanggal      : 22 Februari 2025
 */

public class Garis {

    /************* ATRIBUT *************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /************* METHOD *************/
    // Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    public Garis () {
        titikAwal = new Titik (0,0);
        titikAkhir = new Titik (1,1);
        counterGaris++;
    }

    // Konstruktor dengan parameter masukan titik awal dan titik akhir.
    public Garis (Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Mengembalikan titik awal
    public Titik getTitikAwal () {
        return titikAwal;
    }

    // Mengembalikan titik akhir
    public Titik getTitikAkhir () {
        return titikAkhir;
    }

    // Mengeset titik awal dengan nilai baru T
    public void setTitikAwal (Titik T) {
        titikAwal = T;
    }

    // Mengeset titik akhir dengan nilai baru T
    public void setTitikAkhir (Titik T) {
        titikAkhir = T;
    }

    // Selektor untuk mendapatkan atribut static counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mendapatkan panjang sebuah garis
    public double getPanjang() {
        return Math.sqrt(Math.pow((titikAwal.getAbsis()-titikAkhir.getAbsis()), 2) + Math.pow((titikAkhir.getOrdinat()-titikAkhir.getOrdinat()),2));
    }

    // Mendapatkan gradien dari sebuah garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat())/(titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mendapatkan ƟƟk tengah dari sebuah garis
    public Titik getTitikTengah() {
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis())/2, (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2);
    }

    // Mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya
    public boolean cekSejajar(Garis G) {
        return getGradien() == G.getGradien();
    }

    // Mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya
    public boolean cekTegakLurus(Garis G) {
        return getGradien() * G.getGradien() == -1;
    }

    // Menampilkan ke layar titik awal dan titik akhir garis
    public void printGaris() {
        System.out.print("Titik awal : " );
        titikAwal.printTitik();
        System.out.print("Titik akhir : ");
        titikAkhir.printTitik();
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    public void printPersamaan() {
        double c = titikAwal.getOrdinat() - (titikAwal.getAbsis() * getGradien());
        System.out.print("y = " + getGradien() + ".x + ");
        System.out.println(c);
    }
}
// end class Garis