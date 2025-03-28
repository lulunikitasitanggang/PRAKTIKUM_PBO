public class Main {
    public static void main(String[] args) {
        Fakultas fsm = new Fakultas("FSM", 5000000, 7000000);
        Fakultas feb = new Fakultas("FEB", 4000000, 6000000);

        Mahasiswa mhs1 = new Mahasiswa("Lulu", "Lulu@gmail.com", "24060123120032", 4, fsm);
        Mahasiswa mhs2 = new Mahasiswa("Nikita", "Nikita@gmail.com", "21020124120031", 2, feb);

        Dosen dosen1 = new Dosen("Satriyo", "Satriyo@gmail.com", "123456789876", 5, fsm);
        Tendik tendik1 = new Tendik("Adhy", "Adhy@gmail.com", "456789123456", 10);

        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();
        System.out.println();
        dosen1.tampilkanInfo();
        System.out.println();
        tendik1.tampilkanInfo();

    }
}