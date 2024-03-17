package plsaj.DB;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package crud.Model.DB;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author Wahyu Khoirur Rizal
// */
//public class KoneksiDB {
//    private static final String URL = "jdbc:mysql://localhost:3306/javapbo2";
//    private static final String UserDB = System.getenv("root");
//    private static final String PassDb = System.getenv("");
//    
//    public static Connection koneksiDB(){
//        try {
//            Connection conDB = (Connection) DriverManager.getConnection(URL, UserDB, PassDb);
//            return conDB;
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Koneksi ke Database", "ERROR",
//            JOptionPane.INFORMATION_MESSAGE);
//            System.err.println(e.getMessage());
//            System.exit(0);
//        }
//        return null;
//    }
//}
