/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/*
Kevin Julian Rahadinata - 210711024
Michael Kevin Kimyuwono - 210711056
*/

import dao.CustomerDAO;
import java.util.List;
import model.Customer;
import model.Kendaraan;
import model.Penyewaan;
import table.TableCustomer;

public class CustomerControl {
    private CustomerDAO cDao = new CustomerDAO();
    
    public void insertDataCustomer(Customer c){
        cDao.insertCustomer(c);
    }
    
    public TableCustomer showCustomer(String query){
        List<Customer> dataCustomer = cDao.showCustomer();
        TableCustomer tableCustomer = new TableCustomer(dataCustomer);
        return tableCustomer;
    }
    
    public void updateDataCustomer(Customer c){
        cDao.updateCustomer(c);
    }
    
    public TableCustomer showCustomerBySearch(String query){
        List<Customer> dataCustomer = cDao.showCustomerBySearch(query);
        TableCustomer tableCustomer = new TableCustomer(dataCustomer);
        return tableCustomer;
    }
    
     public List<Customer> showListCustomer(){
        List<Customer> customer = cDao.showCustomer();
        return customer;
    }
    
     public void deleteCustomer(int id){
         cDao.deleteCustomer(id);
     }
}
