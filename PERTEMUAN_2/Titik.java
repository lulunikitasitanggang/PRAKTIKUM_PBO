/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Lulu Nikita Sitanggang (24060123120032)
 * Tanggal      : 22 Februari 2025
 */

public class Titik {    /**************** ATRIBUT *****************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /**************** METHOD *****************/
    // Konstruktor tanpa parameter untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Konstruktor dengan parameter masukan x dan y
    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Menghitung kuadran titik
    public int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        }
        else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        }
        else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        }
        else if (getAbsis() > 0 && getOrdinat() < 0) {
            return 4;
        }else {
            return -1;
        }
    }

    // Menghitung jarak titik dari pusat
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // Menghitung jarak 2 titik
    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow((absis-T.absis), 2) + Math.pow((ordinat-T.ordinat),2));
    }

    // Refleksi dari sumbu X
    public void refleksiX(){
        ordinat = ordinat * -1;
    }

    // Refleksi dari sumbu Y
    public void refleksiY(){
        absis = absis * -1;
    }

    // getRefleksi dari sumbu X
    public Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    // getRefleksi dari sumbu Y
    public Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }
}
//end class Titik