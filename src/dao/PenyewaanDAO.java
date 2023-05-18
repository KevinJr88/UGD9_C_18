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
        
        String sql = "INSERT INTO penyewaan(id, lama_sewa, total_harga, fasilitas, id_kendaraan, id_customer)"
                + "VALUE ('" + p.getId() + "','" + p.getLama_sewa() + "','" + p.getTotal_harga() + "','"
                + p.getFasilitas() + "','" + p.getKendaraan().getId()+ "','" + p.getCustomer().getId()+ "')";
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
        
        String sql = "SELECT p.*, k.*, c.* FROM penyewaan as p JOIN kendaraan as k ON p.id_kendaraan = k.id "
                + "JOIN customer as c ON p.id_customer = c.id "
                + "WHERE (k.merk LIKE "
                +"'%" + query + "%'"
                + "OR k.jenis LIKE '%" + query + "%'"
                + "OR c.nama LIKE '%" + query + "%'"
                + "OR p.lama_sewa LIKE '%" + query + "%'"
                + "OR p.total_harga LIKE '%" + query + "%'"
                + "OR p.fasilitas LIKE '%" + query + "%'"
                + "OR k.jumlah_penumpang LIKE '%" + query + "%'"
                + "OR k.jenis_tak LIKE '%" + query + "%')" ;
        
        System.out.println("Mengambil data penyewaan...");
        
        List<Penyewaan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Kendaraan k = new Kendaraan(
                            rs.getString("k.id"),
                            rs.getString("k.merk"),
                            rs.getString("k.jenis"),
                            rs.getInt("k.tahunPembuatan"),
                            rs.getString("k.noPlat"),
                            rs.getInt("k.jumlah_penumpang"),
                            rs.getString("k.jenis_tak")
                    );
                    
                    Customer c = new Customer(
                            rs.getInt("c.id"),
                            rs.getString("c.nama"),
                            rs.getString("c.ktp"),
                            rs.getString("c.no_telepon")
                    );
                    Penyewaan p = new Penyewaan(
                            rs.getInt("p.id"),
                            rs.getString("p.lama_sewa"),
                            rs.getFloat("p.total_harga"),
                            rs.getString("p.fasilitas"),
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
        
        String sql = "UPDATE penyewaan SET id_kendaraan = '" + p.getKendaraan().getId()// ._.'
                + "', id_customer = '" + p.getCustomer().getId()
                + "', lama_sewa = '" + p.getLama_sewa()
                + "', total_harga = '" + p.getTotal_harga()
                + "', fasilitas = '" + p.getFasilitas()
                + "' WHERE id = '" + p.getId() + "'";
                
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
    
    public void deletePenyewaan(int query){
        con = dbCon.makeConnection();
        
   
        String sql = "DELETE FROM penyewaan WHERE id = " + query + "";
        System.out.println("Deleting penyewaan ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Mata Kuliah " + query);
            statement.close();
        } catch(Exception e){
            System.out.println("Error deleting penyewaan ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
