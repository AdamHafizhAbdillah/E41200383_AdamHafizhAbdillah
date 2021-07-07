/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    
    //variabel untuk menampung koneksi
    public static Connection conn;
    
    //fungsi untuk melakukan cek koneksi
    public static Connection cekKoneksi(){
        if(conn == null){
        try {
            //register
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //isi variabel conn
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tabel" , "root" , "");
            System.out.println("koneksi berhasil");
              
        } catch (SQLException e){
            System.out.println("koneksi gagal!");
            System.out.println(e.getMessage());
        }
        
        }
        return conn;
    }
    
    public static void main(String[] args){
        cekKoneksi();
    
    }
     
     }
    

