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
import model.Customer;
import model.Penyewaan;

public class CustomerDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public List<Customer> showCustomer(){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM customer"; //KEMUNGKINAN SALAH
        System.out.println("Mengambil data customer ...");
        
        List<Customer> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Customer c = new Customer(
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("ktp"),
                            rs.getString("no_telepon")
                    );
                    list.add(c);
                }
            }
            rs.close();
            statement.close();
        } catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }
    
    public void insertCustomer(Customer c){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO customer(id, nama, ktp, no_telepon) "
                + "VALUES ('" + c.getId() + "', '" + c.getNama() + "', '"
                + c.getKtp() + "', '" + c.getNo_telepon() + "')";
        
        System.out.println("Menambahkan customer ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Menambahkan " + result + " Customer");
            statement.close();
        }catch(Exception e){
            System.out.println("Error menambahkan customer ...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateCustomer(Customer c){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE customer SET nama = '" + c.getNama() + "', "
                + "ktp = '" + c.getKtp() + "' "
                + ", no_telepon = '" + c.getNo_telepon() + "' "
                + "WHERE id = '" + c.getId() + "'";
        
        System.out.println("Editing Customer ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Customer " + c.getId());
            statement.close();
        } catch(Exception e){
            System.out.println("Error editing customer");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Customer> showCustomerBySearch(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM customer "
                + "WHERE (c.nama LIKE "
                + "'%" + query + "%'"
                + "OR c.ktp LIKE '%" + query + "%'"
                + "OR c.no_telepon LIKE '%" + query + "%'"
                + "OR c.id LIKE '%" + query + "%'";
        
        System.out.println("Mengambil data customer ...");
        List<Customer> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if(rs!=null){
                while(rs.next()){  
                    Customer c = new Customer(
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("ktp"),
                            rs.getString("no_telepon")
                    );
                    list.add(c);
            }
        }
        rs.close();
        statement.close();
        }catch(Exception e){
            System.out.println("error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        return list;
    }
    
    public void deleteCustomer(int query){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM customer WHERE id = " + query + "";
        System.out.println("Deleting Customer ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Customer " + query);
            statement.close();
        } catch(Exception e){
            System.out.println("Error deleting customer");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
