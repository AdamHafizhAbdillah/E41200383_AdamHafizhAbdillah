/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;
import java.util.Arrays
/**
 *
 * @author User
 */
public class tugas3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Banyak Data = ");
        int Banyakdata;
        Banyakdata = sc.nextInt();
        double rata2 = 0;
        double hasil = 0;
        int[]Array = new int(Banyakdata);
         
        for (int i = 0; i < Banyakdata; i++) {
             System.out.println("Masukkan Data Ke - " + (i+1));
             Array[i] = sc.nextInt();
                         
        }
        Arrays.sort(Array);
        int min = Array[0];
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {
            
        }
        for (int i = 0; i < Array.length; i++)  {
            if (Array[i] > max){
                max = Array[i];
                                
            }else
        
        
                min = Array[i];
                
            }
          System.out.println("Nilai maximum = "+max);
          System.out.println("Nilai minimum = "+min);
          
        for (int i = 0; i < Array.length; i++) {
            hasil += Array[i];
            rata2 = hasil/Array.length;
            
        }
        System.out.println("Rata2 = " + rata2);
        
        
            
        
    }
                }
        
        
        
                
       
                
       
        
   
    

