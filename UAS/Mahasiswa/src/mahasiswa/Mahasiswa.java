/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author kieee
 */
public class Mahasiswa {
    String membaca, nyontek, modifikasi, lulus;
    Double ipk;
    int semester;
    
    void printMahasiswa(){
        System.out.println("Mahasiswa Semester " + semester + " Membaca " + membaca);
        System.out.println("Mahasiswa Semester " + semester + " Memodifikasi " + modifikasi);
        System.out.println("Mahasiswa Semester " + semester +  nyontek);
        System.out.println("Mahasiswa Semester " + semester + " Mendapat IPK : " + ipk);
        System.out.println("Mahasiswa Semester " + semester + " Mendapat Hasil : " + lulus);
    }
}
