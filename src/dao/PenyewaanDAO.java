/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/*
Kevin Julian Rahadinata - 210711024
Michael Kevin Kimyuwono - 210711056
*/

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Penyewaan;

public class PenyewaanDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertPenyewaan(Penyewaan p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO penyewaan(id, lama_sewa, total_harga, fasilitas, kendaraan, customer)"
                + "VALUE ('" + p.getId() + "','" + p.getLama_sewa() + "','" + p.getTotal_harga() + "','"
                + p.getFasilitas() + "','" + p.getKendaraan() + "','" + p.getCustomer() + "')";
        System.out.println("Menambahkan Penyewaan ...");
    
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Menambahkan " + result + " Penyewaan");
            statement.close();
        } catch(Exception e){
            System.out.println("Error saat menambahkan penyewaan ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    
}
