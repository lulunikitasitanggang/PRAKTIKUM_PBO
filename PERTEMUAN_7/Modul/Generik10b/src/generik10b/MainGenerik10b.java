/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generik10b;

public class MainGenerik10b {
    public static void main(String[] args) {
        Datum<Kucing> kucingDatum = new Datum<>();
        kucingDatum.setIsi(new Kucing("Neko"));

        Datum<Anjing> anjingDatum = new Datum<>();
        anjingDatum.setIsi(new Anjing("Bruno"));

        Datum<Burung> burungDatum = new Datum<>();
        burungDatum.setIsi(new Burung("Pico"));

        ContohMetodeGenerik.tampilkanPerilaku(kucingDatum);
        ContohMetodeGenerik.tampilkanPerilaku(anjingDatum);
        ContohMetodeGenerik.tampilkanPerilaku(burungDatum);
    }
}
