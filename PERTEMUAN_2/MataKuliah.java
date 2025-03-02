/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class mata kuliah
 * Pembuat      : Lulu Nikita Sitanggang
 * Tanggal      : 1 Maret 2025
 */

public class MataKuliah {
    private String idMatkul;
    private String namaMk;
    private int sks;

    // Tanpa parameter
    public MataKuliah(){
        this("","",0);
    }

    // Dengan parameter
    public MataKuliah(String idMatkul, String namaMk, int sks) {
        this.idMatkul = idMatkul;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    // Selektor
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNamaMk(){
        return namaMk;
    }

    public int getSks(){
        return sks;
    }

    // Mutator
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNamaMk(String namaMk){
        this.namaMk = namaMk;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}
