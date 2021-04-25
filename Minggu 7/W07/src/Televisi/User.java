/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Televisi;

/**
 *
 * @author User
 */
public class User {
    
     public static void main(String[] args) {
        Televisi tv = new Televisi("TV Tempoe Doloem 14 inch ", 10);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
            "METRO TV", "TRANS TV", "TPI", "TV 7", "TVRI","G TV","Global Tv"};

        String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV", "METRO TV",
            "TRANS TV", "TPI", "TV 7","MNC TV"};
        
        System.out.println("Pak hadi membeli tv : " + tv.Desk());
        
        tv.getChannel();
        tv.setChannel(semuaChannel);
        tv.setChannel(channelFavorit);

        tv.setChannelAktif(1);
        tv.Volume(10);
        tv.setChannelAktif(8);
        tv.setChannelAktif(5);
        
    }
}
