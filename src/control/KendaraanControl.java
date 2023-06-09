/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Kevin Julian Rahadinata - 210711024
Michael Kevin Kimyuwono - 210711056
*/

package control;

import dao.KendaraanDAO;
import java.util.List;
import model.Customer;
import model.Kendaraan;
import model.Penyewaan;


public class KendaraanControl {
    private KendaraanDAO kDao = new KendaraanDAO();
    
    public void insertDataKendaraan(Kendaraan k){
        kDao.insertKendaraan(k);
    }
    
    public String showData(boolean value){
        List<Kendaraan> dataKendaraan = kDao.showKendaraan();
        String kendaraanString = "";
        for(int i=0 ; i<dataKendaraan.size(); i++){
            if(value == true){
                kendaraanString = kendaraanString + dataKendaraan.get(i).showData(true) + "\n";  
            } else{
                kendaraanString = kendaraanString + dataKendaraan.get(i).showData(false) + "\n"; 
            }
            
        }
        return kendaraanString;
    }
    
    public Kendaraan searchKendaraan(String idKendaraan){
        Kendaraan k = null;
        k = kDao.searchKendaraan(idKendaraan);
        return k;
    }
    
    public void updateDataKendaraan(Kendaraan k, String idKendaraan){
        kDao.updateKendaraan(k, idKendaraan);
    }
    
    public void deleteDataKendaraan(String idKendaraan){
        kDao.deleteKendaraan(idKendaraan);
    }
    
    public String generateIDMobil(){
        String temp = null;
        temp = kDao.generateIDMobil();
        return temp;
    }
    
    public String generateIDMotor(){
        String temp = null;
        temp = kDao.generateIDMotor();
        return temp;
    }
    
    public List<Kendaraan> showListKendaraan(){
        List<Kendaraan> kendaraan = kDao.showKendaraan();
        return kendaraan;
    }
    
    
}
