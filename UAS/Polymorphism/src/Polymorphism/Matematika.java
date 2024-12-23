/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author kieee
 */
public class Matematika {
    int operasi;
    double doubleOperasi;

    void setPertambahan (int a, int b){
        operasi = a + b;
    }
    void setPertambahan (int a, int b, int c){
        operasi = a + b + c;
    }
    void setPertambahan (double a, double b){
        doubleOperasi = a + b;
    }
    void setPertambahan (double a, double b, double c){
        doubleOperasi = a + b + c;
    }
    void setPengurangan(int a, int b){
        operasi = a - b;
    }
    void setPengurangan(int a, int b, int c){
        operasi = a - b - c;
    }
    void setPengurangan(double a, double b){
        doubleOperasi = a - b;
    }
    void setPengurangan(double a, double b, double c){
        doubleOperasi = a - b - c;
    }
    void setPerkalian(int a, int b){
        operasi = a * b;
    }
    void setPerkalian(int a, int b,int c){
        operasi = a * b * c;
    }
    void setPerkalian(double a, double b){
        doubleOperasi = a * b ;
    }
    void setPerkalian(double a, double b, double c){
        doubleOperasi = a * b * c;
    }
    void setPembagian(int a, int b){
        operasi = a / b;
    }
    void setPembagian(int a, int b,int c){
        operasi = a / b / c;
    }
    void setPembagian(double a, double b){
        doubleOperasi = a / b;
    }
    void setPembagian(double a, double b, double c){
        doubleOperasi = a / b / c;
    }
    int getOperasi (){
        return operasi;
    }
    double getDoubleOperasi(){
        return doubleOperasi;
    }
}
