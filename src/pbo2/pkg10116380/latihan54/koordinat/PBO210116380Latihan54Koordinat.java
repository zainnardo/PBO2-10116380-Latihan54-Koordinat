/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan54.koordinat;

/**
 * Nama : Zain Achmad Rizqullah 
 * Nim : 10116380
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang warna koordinat
 */
public class PBO210116380Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         WarnaKoordinat wk = new  WarnaKoordinat(0,0,"");
        wk.setNamaWarna("Jingga");
        wk.setX(10);
        wk.setY(4);
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + wk.getX() + ", y : " 
                            + wk.getY());
        
    }
    
}
