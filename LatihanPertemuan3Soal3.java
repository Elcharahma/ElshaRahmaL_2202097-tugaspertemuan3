/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan3soal3;

/**
 *
 * @author ELSHA
 * Menghitung lama dalam jam dan menit berdasarkan selisih waktu dalam menit
berdasarkan jam mulai (jam,menit) dan jam selesai (jam menit)
 */
import java.util.Scanner;
public class LatihanPertemuan3Soal3 {

    public static void main(String[] args) {
        Scanner waktu = new Scanner(System.in);
        System.out.println("Jam Mulai dan Menit Mulai (pake spasi ye)");
        int jamAwal = waktu.nextInt();
        int menitAwal = waktu.nextInt();
        
        System.out.println("Jam Keluar dan Menit Keluar (pake spasi ye)");
        int jamAkhir = waktu.nextInt();
        int menitAkhir = waktu.nextInt();
        
        int tMenitAwal = jamAwal * 60 + menitAwal;
        int tMenitAkhir = jamAkhir * 60 + menitAkhir;
        int selisihMenit = tMenitAkhir - tMenitAwal;
        
        int jam = selisihMenit / 60;
        int menit = selisihMenit % 60;
        
        System.out.println("Lama Menit : "+selisihMenit);
        System.out.println("Lama : "+jam+" jam " +menit+" menit ");
        
    }
}
