/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

/**
 *
 * @author User
 */
class book {
    int price;
    int pages;
    
    public void set (int price, int pages) {
        this.price = price;
        this.pages = pages;       
    }
    
    public void show () {
        System.out.println("buku cerita");
        System.out.println("harga buku : " +price);
        System.out.println("jumlah halaman : " +pages);    
        
    }    
}

  public class Buku {
      public static void main(String[] args) {
          book Javabook = new book();
          Javabook.set(60000, 100);
          Javabook.show();          
          
      }
      
    
}
