/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author kieee
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();

        mtk.setPertambahan(23, 34);
        System.out.println("Hasil dari Pertambahan = " + mtk.getOperasi());
        mtk.setPengurangan(24, 12);
        System.out.println("Hasil dari Pengurangan = " + mtk.getOperasi());
        mtk.setPerkalian(9, 2);
        System.out.println("Hasil dari Perkalian = " + mtk.getOperasi());
        mtk.setPembagian(20, 5);
        System.out.println("Hasil dari Pembagian = " + mtk.getOperasi());
    }
}
