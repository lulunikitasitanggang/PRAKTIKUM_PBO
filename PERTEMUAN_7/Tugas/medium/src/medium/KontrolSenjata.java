/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public void menembak(int jumlah) {
    System.out.println(">> Siap menembak " + jumlah + " kali");

    if (senjata.getPeluru() == 0) {
        System.out.println("Peluru Habis");
        return; // langsung keluar dari method, tidak lanjut nembak
    }

    for (int i = 0; i < jumlah; i++) {
        if (senjata.getPeluru() > 0) {
            System.out.println(senjata.getBunyi());
            senjata.setPeluru(senjata.getPeluru() - 1);
        } else {
            System.out.println("Gagal tembak, Peluru Habis");
        }
    }

    System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void isiPeluru(int jumlah) {
        senjata.setPeluru(senjata.getPeluru() + jumlah);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("Menusuk!");
        } else {
            System.out.println("Gagal menusuk, senjata tidak mendukung menusuk");
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
}
