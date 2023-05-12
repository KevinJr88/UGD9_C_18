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
import model.Kendaraan;
import model.Customer;

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
    
    public List<Penyewaan> showPenyewaan(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM penyewaan"; // KEMUNGKINAN SALAH
        System.out.println("Mengambil data penyewaan...");
        
        List<Penyewaan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Kendaraan k = new Kendaraan(
                            rs.getString("id"),
                            rs.getString("model"),
                            rs.getString("jenis"),
                            rs.getInt("tahunPembuatan"),
                            rs.getString("noPlat"),
                            rs.getInt("jumlah_penumpang"),
                            rs.getString("jenis_tak")
                    );
                    
                    Customer c = new Customer(
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("ktp"),
                            rs.getString("no_telepon")
                    );
                    Penyewaan p = new Penyewaan(
                            rs.getInt("id"),
                            rs.getString("lama_sewa"),
                            rs.getFloat("total_harga"),
                            rs.getString("fasilitas"),
                            k,c
                    );
                    list.add(p);
            }
        }
        rs.close();
        statement.close();
    }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
    }
    dbCon.closeConnection();
    return list;
    }
    
    public void updatePenyewaan(Penyewaan p){
        con = dbCon.makeConnection();
        
        String sql = "";// BELUM DIISI
                
        System.out.println("Editing Penyewaan ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Editing " + result + " Mata Kuliah " + p.getId());
            statement.close();
        } catch(Exception e){
            System.out.println("Error editing penyewaan ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void deletePenyewaan(int id){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM penyewaan WHERE id = " + id + "";
        System.out.println("Deleting penyewaan ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Mata Kuliah " + id);
            statement.close();
        } catch(Exception e){
            System.out.println("Error deleting penyewaan ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
