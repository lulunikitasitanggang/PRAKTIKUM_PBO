/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generik10a;

public class MainGenerik10a {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Neko"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Bruno"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Pico"));

        System.out.println("Tes gerakan dan suara Anabul:");

        datumKucing.getIsi().gerak();
        datumKucing.getIsi().bersuara();

        datumAnjing.getIsi().gerak();
        datumAnjing.getIsi().bersuara();

        datumBurung.getIsi().gerak();
        datumBurung.getIsi().bersuara();
    }
}
