/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author kieee
 */
public class MahasiswaBeraksi {
     public static void main(String[] args) {
        Mahasiswa mahasiswaSemesterSatu = new Mahasiswa();
        mahasiswaSemesterSatu.semester = 1;
        mahasiswaSemesterSatu.membaca = "Buku Dasar Pemrograman";
        mahasiswaSemesterSatu.modifikasi = "Laptopnya Menjadi Keren";
        mahasiswaSemesterSatu.nyontek = " Tidak Menyontek";
        mahasiswaSemesterSatu.ipk = 3.7;
        mahasiswaSemesterSatu.lulus = "Lulus";
        mahasiswaSemesterSatu.printMahasiswa();

        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        Mahasiswa mahasiswaSemesterTiga = new Mahasiswa();
        mahasiswaSemesterTiga.semester = 3;
        mahasiswaSemesterTiga.membaca = "Buku Pemrograman Lanjutan";
        mahasiswaSemesterTiga.modifikasi = "Software";
        mahasiswaSemesterTiga.nyontek = " Tidak Menyontek";
        mahasiswaSemesterTiga.ipk = 3.5;
        mahasiswaSemesterTiga.lulus = "Lulus";
        mahasiswaSemesterTiga.printMahasiswa();

        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        Mahasiswa mahasiswaSemesterLima = new Mahasiswa();
        mahasiswaSemesterLima.semester = 5;
        mahasiswaSemesterLima.membaca = "Buku Cara Memancing";
        mahasiswaSemesterLima.modifikasi = "Joran";
        mahasiswaSemesterLima.nyontek = " Menyontek";
        mahasiswaSemesterLima.ipk = 3.2;
        mahasiswaSemesterLima.lulus = "Lulus";
        mahasiswaSemesterLima.printMahasiswa();
    }
}
