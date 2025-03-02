/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class dosen
 * Pembuat      : Lulu Nikita Sitanggang
 * Tanggal      : 1 Maret 2025
 */

public class Dosen {
    private String NIP;
    private String nama;
    private String prodi;
    
    // Tanpa parameter
    public Dosen(){
        this("","","");
    }

    // Dengan parameter
    public Dosen(String NIP, String nama, String prodi) {
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor
    public String getNama(){
        return nama;
    }

    public String getNIP(){
        return NIP;
    }

    public String getProdi(){
        return prodi;
    }

    // Mutator
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

}
