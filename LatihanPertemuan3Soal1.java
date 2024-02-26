/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan3soal1;

/**
 *
 * @author ELSHA
 * Buatlah algoritma dalam bahasa Java, menerima masukan berupa sebuah bilangan ril,
periksa apakah angka didepan koma dan angka dibelakang koma adalah kelipatan 3
(angka dibelakang koma pasti 2 angka).
 */
import java.util.Scanner;
public class LatihanPertemuan3Soal1 {

    public static void main(String[] args) {
    
        Scanner rill = new Scanner(System.in);
        System.out.println("Masukkan Bilangan rill : ");
        double bilRil = rill.nextDouble();
        
        int depanKoma = (int) bilRil;
        double belakangKoma = bilRil - depanKoma;
        
        belakangKoma = belakangKoma * 100.0;
        int belKoma = (int) belakangKoma;
             
        if(depanKoma % 3 == 0 && belKoma % 3 == 0){
            System.out.println("Angka didepan dan dibelakang Koma adalah Kelipatan 3");
        }else{
            System.out.println("Angka didepan dan dibelakang Koma BUKAN Kelipatan 3");
        }
       System.out.println("Angka Depan Koma : "+depanKoma);
        System.out.println("Angka Belakang Koma : "+belKoma);
    }
}
