/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan59.detectiveconan;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan caracter
 */

public class Karakter extends DetectiveConan {
        private String keahlian;

    public Karakter(String keahlian, String nama, String asal, boolean detective) {
        super(nama, asal, detective);
        this.keahlian = keahlian;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void tampilKarakter() {
        System.out.println("Nama\t\t : " +nama);
        System.out.println("Dari\t\t : " +asal);
        if(detective) {
            System.out.println("Detective\t : Iya");
        } else {
            System.out.println("Detective\t : Tidak");
        }
        System.out.println("Keahlian\t : " +keahlian);
        System.out.println();
}
}