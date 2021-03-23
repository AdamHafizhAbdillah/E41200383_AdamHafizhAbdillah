/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menerapkan_array_dan_conditional_statement.TUGAS;

import java.util.Scanner;

/**
 *
 * @author saya sendiri
 */
public class tugas2 {

    public static void main(String[] args) {
        int array;
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang array : " );
        int PanjangArray = sc.nextInt();
        int NilaiArray[] = new int[PanjangArray];
        System.out.println("Masukkan Nilai Array : ");
        for (int i =0; i<PanjangArray; i++){
        NilaiArray[i]= (int)(Math.random()*20+1);
    }
        System.out.print("Array =" );
        for (int i=0;i<PanjangArray;i++){
        System.out.print(" " +NilaiArray[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
