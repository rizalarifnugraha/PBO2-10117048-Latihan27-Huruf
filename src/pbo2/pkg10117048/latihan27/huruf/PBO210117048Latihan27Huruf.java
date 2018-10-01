/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan27.huruf;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama              : Rizal Arif Nugraha 
 * Kelas             : PBO2
 * NIM               : 10117048 
 * Deskripsi Program : Program ini menampilkan huruf besar dan kecil dengan 
 *                     menggunakan String.
 */
public class PBO210117048Latihan27Huruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lol ;
        
        System.out.print("Masukkan Kalimat : " );
        
        Scanner huruf = new Scanner(System.in);
        lol = huruf.nextLine();
        
        System.out.println();
        System.out.println("===========Hasil Formating============");
        System.out.println("Huruf Besar\t: " + lol.toUpperCase());
        System.out.println("Huruf Kecil\t: " + lol.toLowerCase());
    }

}
