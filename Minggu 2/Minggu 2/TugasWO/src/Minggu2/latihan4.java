/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class latihan4 {
    
    public static void main(String[] args) {
// buat scanner
        Scanner sl = new Scanner(System.in);
        
// ambil nilai ddari keyword
    System.out.print("Masukkan nilai = ");
    int nilai = sl.nextInt();
    System.out.print("Masukkan nilai = ");
    int nilai2 = sl.nextInt();
    
// Hitung dan print
    int jumlah = nilai + nilai2;
    System.out.println("jumlah = " + jumlah);      
        
    } 
            
}
