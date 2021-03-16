/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2.Tugas;

/**
 *
 * @author User
 */
public class ManagingPeople {
    public static void main(String[] args) {
        
        person p1 = new person("Adam", 19);
        person p2 = new person("Hafizh", 29);
        
        if(p1.getAge()==p2.getAge())
        {
            System.out.println(p1.getAge()+ "Seumuran dengan " + p2.getName());
        }
        
        else 
        {
            System.out.println(p1.getName()+ " Tidak seumuran dengan "+ p2.getName());
        }
    }
   
}
