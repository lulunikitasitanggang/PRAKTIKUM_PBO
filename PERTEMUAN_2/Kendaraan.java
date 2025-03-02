/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class kendaraan
 * Pembuat      : Lulu Nikita Sitanggang
 * Tanggal      : 1 Maret 2025
 */


public class Kendaraan {
    private String noPlat;
    private String jenis;
    
    // Tanpa parameter
    public Kendaraan(){
        this("","");
    }

    // Dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getjenis(){
        return jenis;
    }

    // Mutator
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis){
        this.jenis = jenis;
    }

}
