/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/*
Kevin Julian Rahadinata - 210711024
Michael Kevin Kimyuwono - 210711056
*/

import dao.PenyewaanDAO;
import java.util.List;
import model.Penyewaan;
import table.TablePenyewaan;

public class PenyewaanControl {
    private PenyewaanDAO pDao = new PenyewaanDAO();
    
    public void insertPenyewaan(Penyewaan p){
        pDao.insertPenyewaan(p);
    }
    
    public TablePenyewaan showPenyewaan(String query){
        List<Penyewaan> dataPenyewaan = pDao.showPenyewaan(query);
        TablePenyewaan tablePenyewaan = new TablePenyewaan(dataPenyewaan);
        return tablePenyewaan;
    }
    
    public void updateDataPenyewaan(Penyewaan p){
        pDao.updatePenyewaan(p);
    }
    
    public void deleteDataPenyewaan(String id){
        pDao.deletePenyewaan(id);
    }
}
