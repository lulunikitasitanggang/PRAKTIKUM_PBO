public class Main {
    public static void main(String[] args) {
        anabul[] peliharaan = {
            new kucing("Kitty"),
            new anjing("Doggy"),
            new burung("Birdy")
        };

        for (anabul a : peliharaan) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}