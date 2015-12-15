/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.rekapitulation;

import configuration.HIbernateUtil;
import controllers.ControllersOfKelas;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Jadwal;
import model.Kelas;
import service.ServiceOfJadwal;
import service.ServiceOfKelas;
import ui.datamaster.FormPenilaian;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class RekapJadwal extends javax.swing.JInternalFrame {

    private List<Kelas> listKelas;
    private ControllersOfKelas controll;
    private ServiceOfKelas service;

    /**
     * Creates new form RekapJadwal
     */
    public RekapJadwal() {
        initComponents();
        this.controll = new ControllersOfKelas();
        this.controll.inijectTable((DefaultTableModel) tableJadwal.getModel());
        initCombo();
    }
    
    public void initCombo() {
        this.listKelas = new ServiceOfKelas(HIbernateUtil.config()).findAll();
        
        cbKKelas.removeAllItems();
        for (Kelas aKelas : listKelas) {
            
            cbKKelas.addItem(aKelas.getKodeKelas());
            
        }
        cbKKelas.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbKKelas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtNamaKelas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJadwal = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel1.setText("Kode Kelas");

        cbKKelas.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbKKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbKKelas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKKelasItemStateChanged(evt);
            }
        });
        cbKKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKKelasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel2.setText("Nama Kelas");

        txtNamaKelas.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "Ruangan", "Jam Awal", "Jam Akhir", "Materi", "Instruktur"
            }
        ));
        jScrollPane1.setViewportView(tableJadwal);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbKKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbKKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbKKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKKelasActionPerformed

    private void cbKKelasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKKelasItemStateChanged
        // TODO add your handling code here:
         try {
             controll.initTable();
            if (cbKKelas.getSelectedItem()!=null) {
                Kelas kelas = listKelas.get(cbKKelas.getSelectedIndex());
                txtNamaKelas.setText(kelas.getNamaKelas());
                
                
                ServiceOfJadwal service = new ServiceOfJadwal(HIbernateUtil.config());
                List<Jadwal> jadwal;
                try {
                    
                    jadwal = service.findJadwalByKelas(kelas);
                    System.out.println("jumlah data siswa ditemukan " + jadwal.size());
                    for (Jadwal aJadwal : jadwal) {
                      
                            Object[] value = {aJadwal.getTanggal(), aJadwal.getRuangan().getId(),aJadwal.getJam_awal(),
                                               aJadwal.getJam_akhir(),aJadwal.getMateri().getNama(),aJadwal.getInstruktur().getNama()};
                            controll.getDefaultTableModel().addRow(value);
                      
                    }
                } catch (Exception ex) {
                    Logger.getLogger(RekapJadwal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                txtNamaKelas.setText("");
            }
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
    }//GEN-LAST:event_cbKKelasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbKKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableJadwal;
    private javax.swing.JTextField txtNamaKelas;
    // End of variables declaration//GEN-END:variables
}
