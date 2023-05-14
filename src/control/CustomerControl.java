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
import table.TableCustomer;

public class CustomerControl {
    private CustomerDAO cDao = new CustomerDAO();
    
    
    public TableCustomer showCustomer(String query){
        List<Customer> dataCustomer = cDao.showCustomer();
        TableCustomer tableCustomer = new TableCustomer(dataCustomer);
        return tableCustomer;
    }
}
