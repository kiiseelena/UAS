/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author kieee
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
         MatematikaCanggih mtk = new MatematikaCanggih();

        mtk.setPertambahan(23, 34);
        System.out.println("Hasil dari Pertambahan (2 int) = " + mtk.getOperasi());

        mtk.setPertambahan(12, 28, 14);
        System.out.println("Hasil dari Pertambahan (3 int) = " + mtk.getOperasi());

        mtk.setPertambahan(3.4, 4.9);
        System.out.println("Hasil dari Pertambahan (2 double) = " + mtk.getDoubleOperasi());

        mtk.setPertambahan(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Pertambahan (3 double) = " + String.format("%.2f",mtk.getDoubleOperasi()));

        mtk.setPengurangan(23, 34);
        System.out.println("Hasil dari Pengurangan (2 int) = " + mtk.getOperasi());

        mtk.setPengurangan(12, 28, 14);
        System.out.println("Hasil dari Pengurangan (3 int) = " + mtk.getOperasi());

        mtk.setPengurangan(3.4, 4.9);
        System.out.println("Hasil dari Pengurangan (2 double) = " + mtk.getDoubleOperasi());

        mtk.setPengurangan(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Pengurangan (3 double) = " + String.format("%.2f",mtk.getDoubleOperasi()));

        mtk.setPerkalian(23, 34);
        System.out.println("Hasil dari Perkalian (2 int) = " + mtk.getOperasi());

        mtk.setPerkalian(12, 28, 14);
        System.out.println("Hasil dari Perkalian (3 int) = " + mtk.getOperasi());

        mtk.setPerkalian(3.4, 4.9);
        System.out.println("Hasil dari Perkalian (2 double) = " + mtk.getDoubleOperasi());

        mtk.setPerkalian(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Perkalian (3 double) = " + String.format("%.2f",mtk.getDoubleOperasi()));

        mtk.setPembagian(23, 34);
        System.out.println("Hasil dari Pembagian (2 int) = " + mtk.getOperasi());

        mtk.setPembagian(12, 28, 14);
        System.out.println("Hasil dari Pembagian (3 int) = " + mtk.getOperasi());

        mtk.setPembagian(3.4, 4.9);
        System.out.println("Hasil dari Pembagian (2 double) = " + mtk.getDoubleOperasi());

        mtk.setPembagian(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Pembagian (3 double) = " + String.format("%.2f",mtk.getDoubleOperasi()));

        mtk.setModulus(23, 34);
        System.out.println("Hasil dari Modulus (2 int) = " + mtk.getModulus());

        mtk.setModulus(12, 28, 14);
        System.out.println("Hasil dari Modulus (3 int) = " + mtk.getModulus());

        mtk.setModulus(3.4, 4.9);
        System.out.println("Hasil dari Modulus (2 double) = " + mtk.getDoubleModulus());

        mtk.setModulus(12.5, 28.7, 14.1);
        System.out.println("Hasil dari Modulus (3 double) = " + String.format("%.2f",mtk.getDoubleModulus()));
    }
    }
   
