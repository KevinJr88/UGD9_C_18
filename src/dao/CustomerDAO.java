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
}
