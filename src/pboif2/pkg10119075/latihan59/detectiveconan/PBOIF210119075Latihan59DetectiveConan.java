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
Deskripsi Program : Program ini berisi program untuk menampilkan data detective
 */

public class PBOIF210119075Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Karakter conan = new Karakter("Investigasi","Conan Edogawa (Shinichi Kudo)","Tokyo",true);
        conan.tampilKarakter();
        
        Karakter ran = new Karakter("Karate","Ran Mouri","Osaka",false);
        ran.tampilKarakter();
        
        Karakter ai = new Karakter("Kimia dan Farmasi","Ai Haibara (Shiho Miyano / Sherry)","Tokyo",true);
        ai.tampilKarakter();
    }
    
}