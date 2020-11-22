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
Deskripsi Program : Program ini berisi program untuk menampilkan detective conan
 */

public class DetectiveConan {
    protected String nama, asal;
    protected boolean detective;
    
    public DetectiveConan(String nama, String asal, boolean detective) {
        this.nama = nama;
        this.asal = asal;
        this.detective = detective;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
}
}