/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author julia
 */
public class Kendaraan {
    private String id;
    private String merk;
    private String jenis;
    
    private int tahunPembuatan;
    private String noPlat;
    
    private int jumlah_penumpang;
    private String jenis_tak;
    
    public Kendaraan(String id, String merk, String jenis, int tahunPembuatan,
            String noPlat, int jumlah_penumpang, String jenis_tak){
        this.id = id;
        this.merk = merk;
        this.jenis = jenis;
        this.tahunPembuatan = tahunPembuatan;
        this.noPlat = noPlat;
        this.jumlah_penumpang = jumlah_penumpang;
        this.jenis_tak = jenis_tak;
    }

    public String getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public int getJumlah_penumpang() {
        return jumlah_penumpang;
    }

    public String getJenis_tak() {
        return jenis_tak;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJumlah_penumpang(int jumlah_penumpang) {
        this.jumlah_penumpang = jumlah_penumpang;
    }

    public void setJenis_tak(String jenis_tak) {
        this.jenis_tak = jenis_tak;
    }
    
    public String showData(boolean i){
        
        if(i == true){
            if(this.jenis.equalsIgnoreCase("Mobil")){
                return
                      "ID : " + this.id + 
                      "\nMerk : " + this.merk +
                      "\nTahun : " + this.tahunPembuatan +
                      "\nNomor : " + this.noPlat +
                      "\nJumlah Penumpang : " + this.jumlah_penumpang + "\n\n";  
            } else{
                return "";
            }
        } else{
            if(this.jenis.equalsIgnoreCase("Motor")){
                return 
                    "ID : " + this.id + 
                    "\nMerk : " + this.merk +
                    "\nTahun : " + this.tahunPembuatan +
                    "\nNomor : " + this.noPlat +
                    "\nJenis Motor : " + this.jenis_tak + "\n\n";   
            } else{
                return "";
            }
                 
        }
        
    }

}
