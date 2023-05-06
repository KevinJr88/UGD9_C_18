/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.KendaraanControl;
import exception.IdException;
import exception.JenisException;
import javax.swing.JOptionPane;
import model.Kendaraan;
/**
 *
 * @author julia
 */
public class KendaraanView extends javax.swing.JFrame {
    private KendaraanControl kendaraanControl;
    String action = null;   
    String act = null;
    /**
     * Creates new form KendaraanView
     */
    public KendaraanView() {
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        kendaraanControl = new KendaraanControl();
        showMobilText();
        showMotorText();
    }
    
    public void setComponent(boolean value){
        idInput.setEnabled(value);
        merkInput.setEnabled(value);
        tahunInput.setEnabled(value);
        platInput.setEnabled(value);
        jmlInput.setEnabled(value);
        takInput.setEnabled(value);
        mobilCheck.setEnabled(value);
        motorCheck.setEnabled(value);
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
    }
    
    public void setEditDeleteBtn(boolean value){
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }
    
    public void clearText(){
        idInput.setText("");
        merkInput.setText("");
        tahunInput.setText("");
        platInput.setText("");
        jmlInput.setText("");
        takInput.setText("");
        
        searchInput.setText("");
    }
    
    public void idException() throws IdException{
        if(idInput.getText().length() < 5 || idInput.getText().length() > 8){
            throw new IdException();
        }
    }
    
    // JENIS EXCEPTION MISSING
    
    
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        btnCUD_Panel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        idLbl = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        merkLbl = new javax.swing.JLabel();
        merkInput = new javax.swing.JTextField();
        tahunLbl = new javax.swing.JLabel();
        tahunInput = new javax.swing.JTextField();
        platLbl = new javax.swing.JLabel();
        platInput = new javax.swing.JTextField();
        mobilCheck = new javax.swing.JRadioButton();
        motorCheck = new javax.swing.JRadioButton();
        jmlLbl = new javax.swing.JLabel();
        jmlInput = new javax.swing.JTextField();
        takInput = new javax.swing.JTextField();
        takLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        showPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        motorTxtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        mobilTxtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("OBJECT PERSISTENCE 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Kelompok 18");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("210711024");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("210711056");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        bodyPanel.setBackground(new java.awt.Color(102, 255, 204));

        btnCUD_Panel.setBackground(new java.awt.Color(255, 255, 255));

        addBtn.setText("Tambah");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Hapus");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnCUD_PanelLayout = new javax.swing.GroupLayout(btnCUD_Panel);
        btnCUD_Panel.setLayout(btnCUD_PanelLayout);
        btnCUD_PanelLayout.setHorizontalGroup(
            btnCUD_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCUD_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCUD_PanelLayout.setVerticalGroup(
            btnCUD_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCUD_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnCUD_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn))
                .addContainerGap())
        );

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchInput))
                .addContainerGap())
        );

        inputPanel.setBackground(new java.awt.Color(102, 255, 204));

        idLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idLbl.setForeground(new java.awt.Color(0, 0, 0));
        idLbl.setText("ID Kendaraan");

        merkLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        merkLbl.setForeground(new java.awt.Color(0, 0, 0));
        merkLbl.setText("Merk Kendaraan");

        merkInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merkInputActionPerformed(evt);
            }
        });

        tahunLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tahunLbl.setForeground(new java.awt.Color(0, 0, 0));
        tahunLbl.setText("Tahun Pembuatan");

        platLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        platLbl.setForeground(new java.awt.Color(0, 0, 0));
        platLbl.setText("Nomor Plat");

        mobilCheck.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mobilCheck.setForeground(new java.awt.Color(0, 0, 0));
        mobilCheck.setText("Mobil");
        mobilCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilCheckActionPerformed(evt);
            }
        });

        motorCheck.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        motorCheck.setForeground(new java.awt.Color(0, 0, 0));
        motorCheck.setText("Motor");
        motorCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorCheckActionPerformed(evt);
            }
        });

        jmlLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmlLbl.setForeground(new java.awt.Color(0, 0, 0));
        jmlLbl.setText("Jumlah Penumpang");

        takLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        takLbl.setForeground(new java.awt.Color(0, 0, 0));
        takLbl.setText("Jenis Tak");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLbl)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(merkInput, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahunInput, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahunLbl)
                            .addComponent(merkLbl)
                            .addComponent(platLbl)
                            .addComponent(platInput, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(takInput, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jmlLbl)
                                    .addComponent(jmlInput, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(takLbl)))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(motorCheck)
                                    .addComponent(mobilCheck))))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addGap(18, 18, 18)
                .addComponent(cancelBtn)
                .addGap(20, 20, 20))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(merkLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(merkInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tahunLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tahunInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(platLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(platInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(jmlLbl)
                        .addGap(3, 3, 3)
                        .addComponent(jmlInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(motorCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(takLbl)
                        .addGap(5, 5, 5)
                        .addComponent(takInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        showPanel.setBackground(new java.awt.Color(102, 255, 204));

        motorTxtArea.setEditable(false);
        motorTxtArea.setColumns(20);
        motorTxtArea.setRows(5);
        jScrollPane1.setViewportView(motorTxtArea);

        mobilTxtArea.setEditable(false);
        mobilTxtArea.setColumns(20);
        mobilTxtArea.setRows(5);
        jScrollPane2.setViewportView(mobilTxtArea);

        javax.swing.GroupLayout showPanelLayout = new javax.swing.GroupLayout(showPanel);
        showPanel.setLayout(showPanelLayout);
        showPanelLayout.setHorizontalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        showPanelLayout.setVerticalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bodyPanelLayout.createSequentialGroup()
                        .addComponent(btnCUD_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCUD_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        setComponent(true);
        idInput.setEnabled(false);
        action = "Ubah";
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(rootPane,
                "Apakah yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                kendaraanControl.deleteDataKendaraan(idInput.getText());
                clearText();
                showMobilText();
                showMotorText();
                setEditDeleteBtn(false);
                motorCheck.setSelected(false);
                mobilCheck.setSelected(false);
                JOptionPane.showMessageDialog(null, "Data terhapus !");
                
            } catch(Exception e){
                System.out.println("Error saat menghapus data !");
                System.out.println(e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Data tidak terhapus !");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        setEditDeleteBtn(true);
        setComponent(false);
        
        try{
            Kendaraan kendaraan = kendaraanControl.searchKendaraan(searchInput.getText());
            if(kendaraan == null){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            } else{
                idInput.setText(kendaraan.getId());
                merkInput.setText(kendaraan.getMerk());
                tahunInput.setText(String.valueOf(kendaraan.getTahunPembuatan()));
                platInput.setText(kendaraan.getNoPlat());
                jmlInput.setText(String.valueOf(kendaraan.getJumlah_penumpang()));
                takInput.setText(kendaraan.getJenis_tak());
                
                if(kendaraan.getJenis().equalsIgnoreCase("Mobil")){
                    motorCheck.setSelected(false);
                    mobilCheck.setSelected(true);
                } else {
                    motorCheck.setSelected(true);
                    mobilCheck.setSelected(false);
                }
            }
            
        } catch(Exception e){
            System.out.println("Error saat search");
            System.out.println(e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void merkInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merkInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merkInputActionPerformed

    private void mobilCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilCheckActionPerformed
        motorCheck.setEnabled(false);
        motorCheck.setSelected(false);
        takInput.setEnabled(false);
        takInput.setText("");
        act = "Check Mobil";
    }//GEN-LAST:event_mobilCheckActionPerformed

    private void motorCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorCheckActionPerformed
        // TODO add your handling code here:
        mobilCheck.setEnabled(false);
        mobilCheck.setSelected(false);
        jmlInput.setEnabled(false);
        jmlInput.setText("");
        act  = "Check Motor";
    }//GEN-LAST:event_motorCheckActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try{
            idException();
            //jenisException();
            
            String temp = null;
            
            if(act.equalsIgnoreCase("Check Mobil")){
                temp = "Mobil";
            } else if(act.equalsIgnoreCase("Check Motor")){
                temp = "Motor";
            }
            Kendaraan k = new Kendaraan(idInput.getText(), merkInput.getText(), temp, Integer.parseInt(tahunInput.getText()), 
            platInput.getText(), Integer.parseInt(jmlInput.getText()), takInput.getText());
            
            if(action.equals("Tambah")){
                kendaraanControl.insertDataKendaraan(k);
            } else{
                kendaraanControl.updateDataKendaraan(k, idInput.getText());
            }
            clearText();
            showMobilText();
            showMotorText();
            setComponent(false);
            setEditDeleteBtn(false);
            
        }catch(IdException e){
            JOptionPane.showMessageDialog(this, e.message());
        } /*catch(JenisException e1){
            JOptionPane.showMessageDialog(this, e1.message());
        }*/
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        setComponent(false);
        setEditDeleteBtn(false);
        motorCheck.setSelected(false);
        mobilCheck.setSelected(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        setComponent(true);
        clearText();
        searchInput.setText("");
        action = "Tambah";
    }//GEN-LAST:event_addBtnActionPerformed

    public void showMobilText(){
        mobilTxtArea.setText(kendaraanControl.showData(true));
    }
    
    public void showMotorText(){
        motorTxtArea.setText(kendaraanControl.showData(false));
    }
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
            java.util.logging.Logger.getLogger(KendaraanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KendaraanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KendaraanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KendaraanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KendaraanView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel btnCUD_Panel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLbl;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jmlInput;
    private javax.swing.JLabel jmlLbl;
    private javax.swing.JTextField merkInput;
    private javax.swing.JLabel merkLbl;
    private javax.swing.JRadioButton mobilCheck;
    private javax.swing.JTextArea mobilTxtArea;
    private javax.swing.JRadioButton motorCheck;
    private javax.swing.JTextArea motorTxtArea;
    private javax.swing.JTextField platInput;
    private javax.swing.JLabel platLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel showPanel;
    private javax.swing.JTextField tahunInput;
    private javax.swing.JLabel tahunLbl;
    private javax.swing.JTextField takInput;
    private javax.swing.JLabel takLbl;
    // End of variables declaration//GEN-END:variables
}
