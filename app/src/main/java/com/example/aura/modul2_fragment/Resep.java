package com.example.aura.modul2_fragment;

public class Resep {

    private String nama_makanan;
    private String deskripsi;

    public static final Resep[] resepmakanan={
            new Resep("Cilok", "tepung, terasi, air" ),
            new Resep("Batagor", "tepung, kacang, daging" ),
            new Resep("Bakwan", "tepung, jagung, air" ),

            new Resep("Cilok2", "tepung, terasi, air" ),
            new Resep("Batagor2", "tepung, kacang, daging" ),
            new Resep("Bakwan2", "tepung, jagung, air" ),

            new Resep("Cilok3", "tepung, terasi, air" ),
            new Resep("Batagor3", "tepung, kacang, daging" ),
            new Resep("Bakwan3", "tepung, jagung, air" ),

            new Resep("Cilok4", "tepung, terasi, air" ),
            new Resep("Batagor4", "tepung, kacang, daging" ),
            new Resep("Bakwan4", "tepung, jagung, air" ),
    };

    public Resep(String name, String description) {
        this.nama_makanan = name;
        this.deskripsi = description;
    }

    public String getName() {
        return nama_makanan;
    }

    public String getDescription() {
        return deskripsi;
    }

    public String toString() {
        return this.nama_makanan;
    }
}
