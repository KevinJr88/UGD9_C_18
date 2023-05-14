/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

/*
Kevin Julian Rahadinata - 210711024
Michael Kevin Kimyuwono - 210711056
*/

import javax.swing.table.AbstractTableModel;
import java.util.List;
import model.Customer;

public class TableCustomer extends AbstractTableModel{
    private List<Customer> list;
    
    public TableCustomer(List<Customer> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 4;
    }
    
    public String getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return String.valueOf(list.get(rowIndex).getId());
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getKtp();
            case 3:
                return list.get(rowIndex).getNo_telepon();
            default:
                return null;
        }
    }
    
}
