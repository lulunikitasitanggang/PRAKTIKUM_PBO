/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veryeasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    // Konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    // Getter bunyi
    public String getBunyi() {
        return bunyi;
    }

    // Getter peluru
    public int getPeluru() {
        return peluru;
    }

    // Setter bunyi
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    // Setter peluru
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    // Method menembak
    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Peluru habis");
        }
    }
}
