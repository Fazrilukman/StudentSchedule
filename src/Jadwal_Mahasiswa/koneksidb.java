package Jadwal_Mahasiswa;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksidb {
    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private Connection koneksiDB;
     private String password = "";
        public Connection connect(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Berhasil koneksi");
            }catch(ClassNotFoundException ex){
                System.out.println("Gagal koneksi" +ex);
            }
            String url = "jdbc:mysql://localhost:3306/Jadwal_Mahasiswa";
            try{
                koneksiDB = DriverManager.getConnection(url, "root", "");
                System.out.println("Berhasil koneksi database");
            }catch(SQLException ex){
                System.out.println("Gagal koneksi database" +ex);
            }
        return koneksiDB;
        }
    
}