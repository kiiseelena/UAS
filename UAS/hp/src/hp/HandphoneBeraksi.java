/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hp;

/**
 *
 * @author kieee
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hpKu = new Handphone();
        hpKu.hidupkan = "Hidup";
        hpKu.kirimSMS = "Mengirim SMS";
        hpKu.lakukanPanggilan = "Melakukan Panggilan";
        hpKu.matikan = "Mati";
        hpKu.printHandphoneKu();

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        Handphone hpMantan = new Handphone();
        hpMantan.hidupkan = "Tidak Bisa Hidup";
        hpMantan.kirimSMS = "Tidak Dapat Mengirim SMS";
        hpMantan.lakukanPanggilan = "Tidak Dapat Melakukan Panggilan";
        hpMantan.matikan = "Mati Terus";
        hpMantan.printHandphoneMantan();
        
    }
}
