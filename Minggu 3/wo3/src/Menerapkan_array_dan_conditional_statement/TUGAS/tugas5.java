/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menerapkan_array_dan_conditional_statement.TUGAS;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class tugas5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" CAFE LOSS ");
        System.out.println("ANEKA MINUMAN");
        System.out.println("------------------");
        System.out.println("   SPECIAL MENU :");
        System.out.println("1. KOPI ");
        System.out.println("2. SUSU ");
        System.out.println("3. KOPI SUSU ");
        System.out.println("4. JAS JUS ");
        System.out.println("5. MELON ANGET ");
        System.out.println("------------------");
        
        System.out.print("Silahkan Masukkan Nama Pembeli : ");
        String nama = scn.nextLine();
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        int menu = scn.nextInt();
        
        String Menuu = "";
        switch (menu){
            case 1 :
                Menuu = "KOPI ";
                break;
            case 2 :
                Menuu = "SUSU ";
                break;
            case 3 : 
                Menuu = "KOPI SUSU ";
                break;
            case 4 :
                Menuu = "JAS JUS ";
                break;
            case 5 :
                Menuu = " MELON ANGET ";
            default :
                System.out.println("Tidak Ada Dalam Menu");
                break;
        } 
        System.out.print("Minuman yang anda pilih : " + Menuu);
        System.out.println(" Pesanan anda akan segera di antar");
        System.out.println("Terima Kasih " + nama + " telah berkunjung ke loss Cafe");
        

    }
}

