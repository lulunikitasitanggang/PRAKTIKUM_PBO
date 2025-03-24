public abstract class BangunDatar{
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public abstract double getLuas();
    public abstract double getKeliling();

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi (int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi:" + jmlSisi);
        System.out.println("Warna:" + warna);
        System.out.println("Border:" + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar:" + counterBangunDatar);
    }

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}

// Ya, metode isEqualLuas() dan isEqualKeliling() dapat digunakan untuk membandingkan objek bangun datar 
// yang berbeda karena mereka memanggil getLuas() dan getKeliling() yang telah dioverride di subclass, 
// sehingga tetap berfungsi meskipun objeknya berasal dari kelas yang berbeda. Jika BangunDatar tidak 
// dijadikan abstract, metode isEqualLuas() dan isEqualKeliling() tetap bisa dibuat, tetapi kelas harus 
// menyediakan implementasi default untuk getLuas() dan getKeliling(), yang bisa jadi tidak relevan atau
// tidak masuk akal bagi bentuk bangun datar yang spesifik. Kelebihan menjadikan BangunDatar sebagai 
// abstract adalah mencegah instansiasi langsung, memastikan setiap subclass mengimplementasikan metode 
// perhitungan luas dan keliling, serta memungkinkan penggunaan polimorfisme untuk penanganan objek 
// secara lebih fleksibel dan terstruktur.