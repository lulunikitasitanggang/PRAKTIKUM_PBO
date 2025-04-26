class kucing extends anabul {
    public kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan dengan berjalan.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong!");
    }
}