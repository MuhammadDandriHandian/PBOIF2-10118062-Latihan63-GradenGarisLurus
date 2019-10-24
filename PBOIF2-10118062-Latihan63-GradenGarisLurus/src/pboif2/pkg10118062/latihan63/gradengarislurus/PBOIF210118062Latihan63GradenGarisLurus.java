/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan63.gradengarislurus;

/**
 *
 * @author ASUS
 * NAMA     : M Dandri Handian
 * KELAS    : PBOIF2
 * NIM      : 10118062
 */
public class PBOIF210118062Latihan63GradenGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat krd = new Koordinat (2,10,5,7);
        Koordinat krd2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik ("+krd.getX1()+","+krd.getX2()+") dan ("+krd.getY1()+","+krd.getY2()+")");
        System.out.println("memiliki gradient sebesar " +krd.hitungGradient());
        System.out.println("Garis yang melalui titik ("+krd2.getX1()+","+krd2.getX2()+") dan ("+krd2.getY1()+","+krd2.getY2()+")");
        System.out.println("memiliki gradient sebesar " +krd2.hitungGradient());
    }
    
}
