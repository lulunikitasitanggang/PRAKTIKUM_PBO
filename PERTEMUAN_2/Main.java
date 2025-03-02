public class Main {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("123456", "Nurdin", "Informatika");
        
        // Membuat objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("B 1234 ABC", "Motor");
        
        // Membuat objek MataKuliah
        MataKuliah matkul1 = new MataKuliah("MK001", "Pemrograman Beriorientasi Objek", 3);
        MataKuliah matkul2 = new MataKuliah("MK002", "Struktur Data", 4);
        MataKuliah matkul3 = new MataKuliah("MK003", "Algoritma dan Pemrograman", 4);
        MataKuliah matkul4 = new MataKuliah("MK004", "Basis Data", 3);
        MataKuliah matkul5 = new MataKuliah("MK005", "Siscer", 3);
        MataKuliah matkul6 = new MataKuliah("MK006", "RPL", 3);

        Mahasiswa mahasiswa1 = new Mahasiswa("20032", "Lulu Nikita", "Informatika");
        mahasiswa1.setDosen(dosen1);
        mahasiswa1.setKendaraan(kendaraan1);
        mahasiswa1.addMatkul(matkul1);
        mahasiswa1.addMatkul(matkul2);
        mahasiswa1.addMatkul(matkul3);
        mahasiswa1.addMatkul(matkul4);
        mahasiswa1.addMatkul(matkul5);
        mahasiswa1.addMatkul(matkul6);
        mahasiswa1.printDetailMhs();
        mahasiswa1.getJumlahSKS();
    }
}
