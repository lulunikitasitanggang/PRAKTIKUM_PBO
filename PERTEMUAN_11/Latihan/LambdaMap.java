import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan key = NIM, value = Nama Mahasiswa
        Map<String, String> dataMahasiswa = new HashMap<>();
        dataMahasiswa.put("24060123120032", "Lulu Nikita Sitanggang");

        // Menggunakan lambda untuk menampilkan key dan value
        dataMahasiswa.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}
