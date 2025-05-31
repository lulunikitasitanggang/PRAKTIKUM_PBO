/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;

import jdbc.model.mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.ArrayList;
import java.util.List;


public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    public static void main(String[] args) {
        List<mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        // insert
        System.out.println("===insert");
        mahasiswa mhsAdd = new mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();
        
        // update
        System.out.println("===update");
        mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        // delete
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }
    
    public static void displayAll() {
        System.out.println("===displayAll");
        List<mahasiswa> allMahasiswa = service.getAll();
        for (mahasiswa mhs : allMahasiswa) {
            System.out.println(mhs);
        }
        System.out.println("");
    }
}