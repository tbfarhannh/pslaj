/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plsaj.Font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Tubagus Farhan Nur Hakim
 */
public class CustomFont {
    
    private Font PoppinsMedium;
    private Font PoppinsSemiBold;
    //untuk menambahkan font buat private Font untukNamanyaBebas
    //misal private Font PoppinsBold;
 
    public CustomFont(){
        File poppinsmedium = new File("src/plsaj/Font/Poppins-Medium.ttf");
        File popinssemibold = new File("src/plsaj/Font/Poppins-SemiBold.ttf");
        // buat juga seperti diatas sesuaikan dengan file font yang di berikan
        //misal File poppinsbold = new File("src/crud/Model/Font/Poppins-Bold.ttf"); pastikan untuk menyimpan file fontnya di package Font
        try {
            PoppinsMedium = Font.createFont(Font.TRUETYPE_FONT, poppinsmedium);
            PoppinsSemiBold = Font.createFont(Font.TRUETYPE_FONT,popinssemibold);           
            //buat juga seperti diatas sesuaikan nama nya
            //misal PoppinsBold = Font.createFont(Font.TRUETYPE_FONT, poppinsbold);
        } catch (FontFormatException | IOException e) {
            PoppinsMedium = new Font("Dialog,", Font.PLAIN, 50);
            PoppinsSemiBold = new Font("Dialog", Font.PLAIN, 50);
            //buat juga di atas sesuaikan nama nya
            //misal PoppinsBold = new Font("Dialog", Font.PLAIN, 50);
        }
    }
    
    //jika sudah langakah diatas maka buat getter !
    public Font getPoppinsMedium() {
        return PoppinsMedium;
    }
    
    public Font getPoppinsSemiBold() {
        return PoppinsSemiBold;
    }
    
}
