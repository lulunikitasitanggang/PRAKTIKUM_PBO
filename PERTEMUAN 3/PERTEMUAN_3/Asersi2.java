/**
 * File :Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Nama : Lulu Nikita Sitanggang
 */

//class Lingkaran

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 7;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }
}

//PERTANYAAN: secara konsep, ada yang kurang tepat pada program Asersi di atas. Jelaskan
//Kesalahan konsep dalam penggunaan asersi untuk validasi input. Jika asersi dinonaktifkan, validasi tidak berjalan. 
//Sebaiknya gunakan exception handling (if-else + throw) untuk validasi input seperti jari-jari lingkaran yang negatif.