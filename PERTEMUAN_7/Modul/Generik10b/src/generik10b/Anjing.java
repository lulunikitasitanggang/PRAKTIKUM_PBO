/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generik10b;

/**
 *
 * @author Goklee123456
 */
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " merayap.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Guk-guk!");
    }
}
