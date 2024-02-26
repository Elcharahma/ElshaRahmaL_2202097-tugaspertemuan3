/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan3soal2;

/**
 *
 * @author ELSHA
 * Buatlah algoritma dalam bahasa Java, berupa menu yang dapat memasukan pilihan jika
menginputkan karakter operator aritmatika ‘+’ akan melakukan penjumlahan, jika ‘-‘
pengurangan sampai karakter ‘*’, ‘/’ dan ‘%’ dua bilangan integer.
 */
import java.util.Scanner;
public class LatihanPertemuan3Soal2 {
    
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Pilih Operator Aritmatikanya!!");
        System.out.println("+ Tambah");
        System.out.println("- Kurang");
        System.out.println("* Kali");
        System.out.println("/ Bagi");
        System.out.println("% Modulo");
        
        char operator = angka.next().charAt(0);
        int angka1,angka2;
        int hasil = 0;
        switch(operator){
            case '+':
                System.out.println("Masukkan Bilangan Pertama : ");
                angka1 = angka.nextInt();
                System.out.println("Masukkan Bilangan Kedua : ");
                angka2 = angka.nextInt();
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan "+angka1+ " dan "+angka2+" adalah : "+hasil);
                break;
                
             case '-':
                System.out.println("Masukkan Bilangan Pertama : ");
                angka1 = angka.nextInt();
                System.out.println("Masukkan Bilangan Kedua : ");
                angka2 = angka.nextInt();
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan "+angka1+ " dan "+angka2+" adalah : "+hasil);
                break;
                
              case '*':
                System.out.println("Masukkan Bilangan Pertama : ");
                angka1 = angka.nextInt();
                System.out.println("Masukkan Bilangan Kedua : ");
                angka2 = angka.nextInt();
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian "+angka1+ " dan "+angka2+" adalah : "+hasil);
                break;
                
            case '/':
                System.out.println("Masukkan Bilangan Pertama : ");
                angka1 = angka.nextInt();
                System.out.println("Masukkan Bilangan Kedua : ");
                angka2 = angka.nextInt();
                if(angka2 !=0){
                hasil = angka1 / angka2;
                }else{
                  System.out.println("Gabisa dibagi dengan 0");  
                }
                System.out.println("Hasil Pembagian "+angka1+ " dan "+angka2+" adalah : "+hasil);
                break;
                
            case '%':
                System.out.println("Masukkan Bilangan Pertama : ");
                angka1 = angka.nextInt();
                System.out.println("Masukkan Bilangan Kedua : ");
                angka2 = angka.nextInt();
                if(angka2 !=0){
                hasil = angka1 % angka2;
                }else{
                  System.out.println("Gabisa dibagi dengan 0");  
                }
                System.out.println("Hasil Modulo "+angka1+ " dan "+angka2+" adalah : "+hasil);
                break;
                
            default:
                 System.out.println("Salah Input WOYY!!"); 
                 return;
        }
        
    }
}
