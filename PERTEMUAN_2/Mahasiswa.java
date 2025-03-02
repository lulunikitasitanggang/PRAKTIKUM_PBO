/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class mahasiswa
 * Pembuat      : Lulu Nikita Sitanggang
 * Tanggal      : 1 Maret 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String namamhs;
    private String prodimhs;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    // Tanpa parameter
    public Mahasiswa(){
        this("","","");
    }

    // Dengan parameter
    public Mahasiswa(String nim, String namamhs, String prodimhs) {
        this.nim = nim;
        this.namamhs = namamhs;
        this.prodimhs = prodimhs;
        this.listMatKul = new ArrayList<>();
    }

    // Selektor
    public String getNamaMhs(){
        return namamhs;
    }

    public String getNim(){
        return nim;
    }

    public String getProdiMhs(){
        return prodimhs;
    }

    public ArrayList<MataKuliah> getListMatKul(){
        return listMatKul;
    }

    public Dosen getDosen(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    // Mutator
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNamaMhs(String namamhs){
        this.namamhs = namamhs;
    }

    public void setProdiMhs(String prodimhs){
        this.prodimhs = prodimhs;
    }
    
    public void setListMatKul(ArrayList<MataKuliah> listMatKul){
        this.listMatKul = listMatKul;
    }

    public void setDosen(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // Method
    public void addMatkul(MataKuliah mk){
        listMatKul.add(mk);
    }

    public void getJumlahSKS(){
        int total = 0;
        for (MataKuliah mk : listMatKul) {
            total += mk.getSks();
        }
        System.out.println("Jumlah SKS: " + total);
    }

    public void getJumlahMatkul(){
        System.out.println("Jumlah Mata Kuliah: " + listMatKul.size());
    }

    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + namamhs);
        System.out.println("Prodi: " + prodimhs);
    }
    
    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + namamhs);
        System.out.println("Prodi: " + prodimhs);
        System.out.println("Mata Kuliah: ");
        for (MataKuliah mk : listMatKul) {
            System.out.println("- Nama: " + mk.getNamaMk());
        }
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("\nDosen Wali:");
        if (dosenWali != null) {
            System.out.println("- NIP   : " + dosenWali.getNIP());
            System.out.println("- Nama  : " + dosenWali.getNama());
            System.out.println("- Prodi : " + dosenWali.getProdi());
        } else {
            System.out.println("- Tidak memiliki dosen wali.");
        }
        System.out.println("Kendaraan: " + kendaraan.getNoPlat());
    }
}