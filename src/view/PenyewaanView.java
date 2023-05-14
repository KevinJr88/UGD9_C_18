/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.CustomerControl;
import control.KendaraanControl;
import control.PenyewaanControl;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Customer;
import model.Kendaraan;
import model.Penyewaan;
import table.TableCustomer;
import table.TablePenyewaan;

public class PenyewaanView extends javax.swing.JFrame {
    private KendaraanControl kendaraanControl;
    private PenyewaanControl penyewaanControl;
    String action = null;
    List<Kendaraan> listKendaraan;
    int selectedId=0;
    
    public PenyewaanView() {
        initComponents();
        setComponent(false);
        kendaraanControl = new KendaraanControl();
        penyewaanControl = new PenyewaanControl();
        showMataKuliah();
        setActionCommandRadio();
        setKendaraanToDropdown();   
    }
    
    
    
    public void setComponent(boolean value){
        inputLamaSewa.setEnabled(value);
        inputTotalHarga.setEnabled(value);
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
        selectMerkKendaraan.setEnabled(value);
        selectNamaCustomer.setEnabled(value);
        maskerCB.setEnabled(value);
        tissueCB.setEnabled(value);
        snackCB.setEnabled(value);
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
    }

     public void showMataKuliah(){
        tablePenyewaan.setModel(penyewaanControl.showPenyewaan(""));
    }
     
    public void setKendaraanToDropdown(){
        listKendaraan = kendaraanControl.showListKendaraan();
        for(int i=0; i<listKendaraan.size(); i++){
            selectMerkKendaraan.addItem(listKendaraan.get(i));
  
        }
    }
     
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upbarPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kendaraanIcon = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        penyewaanIcon = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        customerIcon = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();
        btnPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        selectMerkKendaraan = new javax.swing.JComboBox<>();
        inputLamaSewa = new javax.swing.JTextField();
        selectNamaCustomer = new javax.swing.JComboBox<>();
        inputTotalHarga = new javax.swing.JTextField();
        snackCB = new javax.swing.JCheckBox();
        maskerCB = new javax.swing.JCheckBox();
        tissueCB = new javax.swing.JCheckBox();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        showPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePenyewaan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        upbarPanel.setBackground(new java.awt.Color(51, 51, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("210711024");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rental Aja ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Kelompok 18");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("210711056");

        kendaraanIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/kendaraanIcon.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Penyewaan");

        penyewaanIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconPenyewaan.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kendaraan");

        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/customerIcon.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Customer");

        javax.swing.GroupLayout upbarPanelLayout = new javax.swing.GroupLayout(upbarPanel);
        upbarPanel.setLayout(upbarPanelLayout);
        upbarPanelLayout.setHorizontalGroup(
            upbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upbarPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(122, 122, 122)
                .addGroup(upbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upbarPanelLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(kendaraanIcon)
                        .addGap(30, 30, 30)
                        .addComponent(penyewaanIcon)
                        .addGap(18, 18, 18)
                        .addComponent(customerIcon)
                        .addGroup(upbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(upbarPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addGroup(upbarPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(upbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)))))
                    .addGroup(upbarPanelLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel13)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel12)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upbarPanelLayout.setVerticalGroup(
            upbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upbarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(penyewaanIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIcon)
                    .addGroup(upbarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(upbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kendaraanIcon)))
                .addGap(1, 1, 1)
                .addGroup(upbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerPanel.setBackground(new java.awt.Color(102, 102, 102));

        btnPanel.setBackground(new java.awt.Color(204, 204, 204));

        addBtn.setBackground(new java.awt.Color(0, 255, 51));
        addBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Tambah");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 255, 0));
        editBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Ubah");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Hapus");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBtn)
                .addGap(14, 14, 14)
                .addComponent(deleteBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        searchPanel.setBackground(new java.awt.Color(255, 204, 0));

        searchInput.setBackground(new java.awt.Color(255, 255, 255));

        searchBtn.setBackground(new java.awt.Color(51, 51, 255));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Cari");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Penyewaan");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn)
                .addGap(38, 38, 38))
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        inputPanel.setBackground(new java.awt.Color(255, 255, 255));

        selectMerkKendaraan.setBackground(new java.awt.Color(255, 255, 255));
        selectMerkKendaraan.setForeground(new java.awt.Color(255, 255, 255));
        selectMerkKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMerkKendaraanActionPerformed(evt);
            }
        });

        inputLamaSewa.setBackground(new java.awt.Color(255, 255, 255));
        inputLamaSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLamaSewaActionPerformed(evt);
            }
        });

        selectNamaCustomer.setBackground(new java.awt.Color(255, 255, 255));
        selectNamaCustomer.setForeground(new java.awt.Color(255, 255, 255));

        inputTotalHarga.setBackground(new java.awt.Color(255, 255, 255));

        snackCB.setBackground(new java.awt.Color(255, 255, 255));
        snackCB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        snackCB.setForeground(new java.awt.Color(0, 0, 0));
        snackCB.setText("Snack");
        snackCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackCBActionPerformed(evt);
            }
        });

        maskerCB.setBackground(new java.awt.Color(255, 255, 255));
        maskerCB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maskerCB.setForeground(new java.awt.Color(0, 0, 0));
        maskerCB.setText("Masker");
        maskerCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maskerCBActionPerformed(evt);
            }
        });

        tissueCB.setBackground(new java.awt.Color(255, 255, 255));
        tissueCB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tissueCB.setForeground(new java.awt.Color(0, 0, 0));
        tissueCB.setText("Tissue");
        tissueCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tissueCBActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(51, 255, 0));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 0, 51));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Batal");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Total Harga");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Kendaraan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama Customer");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Lama Sewa");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fasilitas");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(selectMerkKendaraan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputLamaSewa)
                        .addComponent(selectNamaCustomer, 0, 273, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(snackCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tissueCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maskerCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(100, 100, 100))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectMerkKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maskerCB)
                            .addComponent(tissueCB)
                            .addComponent(snackCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(inputLamaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn)
                            .addComponent(cancelBtn))
                        .addGap(17, 17, 17))))
        );

        showPanel.setBackground(new java.awt.Color(204, 204, 204));

        tablePenyewaan.setBackground(new java.awt.Color(255, 255, 255));
        tablePenyewaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePenyewaan.setGridColor(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(tablePenyewaan);

        javax.swing.GroupLayout showPanelLayout = new javax.swing.GroupLayout(showPanel);
        showPanel.setLayout(showPanelLayout);
        showPanelLayout.setHorizontalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        showPanelLayout.setVerticalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                        .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(containerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(upbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void snackCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snackCBActionPerformed

    private void maskerCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maskerCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maskerCBActionPerformed

    private void tissueCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tissueCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tissueCBActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void inputLamaSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLamaSewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLamaSewaActionPerformed

    private void selectMerkKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMerkKendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMerkKendaraanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PenyewaanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenyewaanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenyewaanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenyewaanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenyewaanView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel customerIcon;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField inputLamaSewa;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JTextField inputTotalHarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel kendaraanIcon;
    private javax.swing.JCheckBox maskerCB;
    private javax.swing.JLabel penyewaanIcon;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JComboBox<String> selectMerkKendaraan;
    private javax.swing.JComboBox<String> selectNamaCustomer;
    private javax.swing.JPanel showPanel;
    private javax.swing.JCheckBox snackCB;
    private javax.swing.JTable tablePenyewaan;
    private javax.swing.JCheckBox tissueCB;
    private javax.swing.JPanel upbarPanel;
    // End of variables declaration//GEN-END:variables
}
