/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Kevin Julian Rahadinata - 210711024
Michael Kevin Kimyuwono - 210711056
*/

package dao;


import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Kendaraan;
import model.Penyewaan;

public class KendaraanDAO {
   private DbConnection dbCon = new DbConnection();
   private Connection con;
   
   public void insertKendaraan(Kendaraan k){
       con = dbCon.makeConnection();
       
       String sql = "INSERT INTO kendaraan(id, merk, jenis, tahunPembuatan, noPlat, jumlah_penumpang, jenis_tak) "
               + "VALUES ('" + k.getId() + "', '" + k.getMerk() + "', '"
               + k.getJenis() + "', '" + k.getTahunPembuatan() + "', '"
               + k.getNoPlat() + "', '" + k.getJumlah_penumpang() + "', '"
               + k.getJenis_tak() + "')";
       
       System.out.println("Menambahkan Kendaraan ...");
       
       try{
           Statement statement = con.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Menambahkan " + result + " Kendaraan");
           statement.close();
       } catch(Exception e){
           System.out.println("Error saat menambahkan kendaraan ...");
           System.out.println(e);
       } 
       dbCon.closeConnection();
   }
   
   public List<Kendaraan> showKendaraan(){
       con = dbCon.makeConnection();
       
       String sql = "SELECT * FROM kendaraan";
       System.out.println("Mengambil data kendaraan ...");
       
       List<Kendaraan> list = new ArrayList();
       
       try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           
           if(rs!=null){
               while(rs.next()){
                   Kendaraan k = new Kendaraan(
                           rs.getString("id"),
                           rs.getString("merk"),
                           rs.getString("jenis"),
                           rs.getInt("tahunPembuatan"),
                           rs.getString("noPlat"),
                           rs.getInt("jumlah_penumpang"),
                           rs.getString("jenis_tak")
                   );
                   list.add(k);
               }
           }
           rs.close();
           statement.close();
       } catch(Exception e){
           System.out.println("Error membaca database ...");
           System.out.println(e);
       }
       dbCon.closeConnection();
       return list;
   }
   
   public Kendaraan searchKendaraan(String idKendaraan){
       con = dbCon.makeConnection();
       
       String sql = "SELECT * FROM kendaraan WHERE id = '" + idKendaraan + "'";
       System.out.println("Mencari Kendaraan ...");
       Kendaraan k = null;
       
       try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           
           if(rs!= null){
               while(rs.next()){
                   k = new Kendaraan(
                           rs.getString("id"),
                           rs.getString("merk"),
                           rs.getString("jenis"),
                           rs.getInt("tahunPembuatan"),
                           rs.getString("noPlat"),
                           rs.getInt("jumlah_penumpang"),
                           rs.getString("jenis_tak")      
                   );
               }
           }
           rs.close();
           statement.close();
       } catch(Exception e){
           System.out.println("Error membaca database ...");
           System.out.println(e);
       }
       dbCon.closeConnection();
       return k;
   }
   
   public void updateKendaraan(Kendaraan k, String idKendaraan){
       con = dbCon.makeConnection();
       
       String sql = "UPDATE kendaraan SET merk = '" + k.getMerk() + "', "
               + "jenis = '" + k.getJenis() + "' "
               + ",tahunPembuatan = '" + k.getTahunPembuatan() + "' "
               + ",noPlat = '" + k.getNoPlat() + "' "
               + ",jumlah_penumpang = '" + k.getJumlah_penumpang() + "' "
               + ",jenis_tak = '" + k.getJenis_tak() + "' "
               + "WHERE id = '" + idKendaraan + "'";
       
       System.out.println("Editing kendaraan ....");
       
       try{
           Statement statement = con.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Edited " + result + " Kendaraan " + idKendaraan);
           statement.close();
       } catch(Exception e){
           System.out.println("Error saat mengedit kendaraan...");
           System.out.println(e);
       }
       dbCon.closeConnection();
   }
   
   public void deleteKendaraan(String idKendaraan){
       con = dbCon.makeConnection();
       
       String sql = "DELETE FROM kendaraan WHERE id = '" + idKendaraan +  "'";
       System.out.println("Menghapus Kendaraan ....");
       
       try{
           Statement statement = con.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Delete " + result + " Kendaraan " + idKendaraan);
           statement.close();
       } catch(Exception e){
           System.out.println("Error saat menghapus kendaraan ....");
           System.out.println(e);
       }
       dbCon.closeConnection();
   }
   
   public String generateIDMotor(){
       con = dbCon.makeConnection();
       
       String sql = "SELECT id FROM kendaraan WHERE jenis = 'Motor' ORDER BY id DESC LIMIT 1";
       System.out.println("Mencari kendaraan ...");
       int id = 0;
       String temp,temp2=null;
       
       try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           
           if(rs.next()){
                temp = rs.getString("id");
                id = Integer.parseInt(temp.split("-")[1]);
                id++;
                temp2 = "MTR-"+ id;
               
           }else{
               temp2 = "MTR-1";
           }
           
           System.out.println("CEK " + temp2);
           
           rs.close();
           statement.close();
       } catch(Exception e){
           System.out.println("Error membaca database ...");
           System.out.println(e);
       }
       dbCon.closeConnection();
       return temp2;
   }
   
   public String generateIDMobil(){
       con = dbCon.makeConnection();
       
       String sql = "SELECT * FROM kendaraan WHERE jenis = 'Mobil' ORDER BY id DESC LIMIT 1";
       System.out.println("Mencari kendaraan ...");
       int id = 0;
       String temp,temp2=null;
       
       try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           
           if(rs.next()){
                temp = rs.getString("id");
                id = Integer.parseInt(temp.split("-")[1]);
                id++;
                temp2 = "MBL-" + id;
           }else{
               temp2 = "MBL-1";
           }
           
           System.out.println("CEK " + temp2);
           
           
           rs.close();
           statement.close();
       } catch(Exception e){
           System.out.println("Error membaca database ...");
           System.out.println(e);
       }
       dbCon.closeConnection();
       return temp2;
   }
   
   
   
}




