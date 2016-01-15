/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.datamaster;

import configuration.HIbernateUtil;
import controllers.ControllersOfKeterangan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Absensi;
import model.Keterangan;
import model.Materi;
import model.Nilai;
import model.Siswa;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import service.ServiceOfKeterangan;
import service.ServiceOfMateri;
import service.ServiceOfNilai;
import service.ServiceOfSiswa;
import ui.dataadd.FormUpdateNilai;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class FormIsiNilai extends javax.swing.JInternalFrame {

    private List<Siswa> listSiswa;
    private Siswa siswa;
    private ServiceOfNilai service;
    private ControllersOfKeterangan control;
    private List<Materi> listMateri;
    private List<Nilai> listNilai = new ArrayList<>();

    /**
     * Creates new form FormIsiNilai
     */
    public FormIsiNilai() {
        initComponents();
        this.service = new ServiceOfNilai(HIbernateUtil.config());
        this.control = new ControllersOfKeterangan();

        this.control.inijectTable((DefaultTableModel) tableKeterangan.getModel());
        this.control.initTable();
        initComboSiswa();
    }

    public void initComboSiswa() {
        this.listSiswa = new ServiceOfSiswa(HIbernateUtil.config()).findAll();

        cbkPeserta.removeAllItems();
        for (Siswa aSiswa : listSiswa) {

            cbkPeserta.addItem(aSiswa.getKodeSiswa());

        }
        cbkPeserta.setSelectedIndex(-1);
    }

    
      private void printDataNilaiSiswa(List<Nilai> list) throws JRException {
        HashMap<String, Object> nilaiMap = new HashMap<String, Object>();
        Siswa siswa = listSiswa.get(cbkPeserta.getSelectedIndex());
        nilaiMap.put("noPeserta", siswa.getKodeSiswa());
        nilaiMap.put("namaPeserta", siswa.getNama());
        

        JasperDesign design = JRXmlLoader.load(getClass().getResourceAsStream("/data_nilai_s.jrxml"));
        JasperReport report = JasperCompileManager.compileReport(design);
        JasperPrint print = JasperFillManager.fillReport(report, nilaiMap, new JRBeanCollectionDataSource(list));
        JasperViewer view = new JasperViewer(print, false);
        view.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKeluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKeterangan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbkPeserta = new javax.swing.JComboBox();
        txtNama = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        btnKeluar.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnKeluar.setIcon(new javax.swing.ImageIcon("/Users/muhamadhanifmuhsin/NetBeansProjects/SIALKA/src/main/resources/icon/exit.png")); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableKeterangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode ", "Nama", "Skor"
            }
        ));
        jScrollPane1.setViewportView(tableKeterangan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("||Isi Nilai||");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel1.setText("No Peserta");

        jLabel2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel2.setText("Nama");

        cbkPeserta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkPeserta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkPesertaItemStateChanged(evt);
            }
        });
        cbkPeserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkPesertaActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("/Users/muhamadhanifmuhsin/NetBeansProjects/SIALKA/src/main/resources/icon/update.png")); // NOI18N
        btnUpdate.setText("Perbaharui");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon("/Users/muhamadhanifmuhsin/NetBeansProjects/SIALKA/src/main/resources/icon/print.png")); // NOI18N
        btnPrint.setText("Cetak");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKeluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbkPeserta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrint)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbkPeserta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate)
                    .addComponent(btnPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeluar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            // TODO add your handling code here:
            printDataNilaiSiswa(listNilai);
        } catch (JRException ex) {
            Logger.getLogger(FormIsiNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void cbkPesertaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkPesertaItemStateChanged
        // TODO add your handling code here:
        System.out.println("aksi");
        control.initTable();
        try {
            if (cbkPeserta.getSelectedIndex() >= 0) {
                siswa = listSiswa.get(cbkPeserta.getSelectedIndex());
                txtNama.setText(siswa.getNama());

                service = new ServiceOfNilai(HIbernateUtil.config());
                updateTableView(siswa);
            } else {
                txtNama.setText("");
            }
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
    }//GEN-LAST:event_cbkPesertaItemStateChanged

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //Fix me gak tampil
        ServiceOfKeterangan service = new ServiceOfKeterangan(HIbernateUtil.config());
        Integer selectedRow = tableKeterangan.getSelectedRow();
        System.out.println(selectedRow + " selected row ");
        if (selectedRow >= 0) {
            Nilai model = listNilai.get(selectedRow);
            System.out.println("tampil keterangan" + model.getKeterangan().getMateri().getNama());
            FormUpdateNilai add = new FormUpdateNilai(null, true, this, model, siswa);

            add.setVisible(true);

        } else {

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cbkPesertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkPesertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbkPesertaActionPerformed

    public void updateTableView(Siswa siswa) {
        control.initTable();

        try {
            listNilai.clear();

            for (Nilai n : service.findNilaiBySiswa(siswa)) {
                listNilai.add(n);
            }
            for (Nilai n : listNilai) {
                System.out.println(n.getSkor() + " nilai diperbaharusi");
            }
            loadDataNilai();
        } catch (NullPointerException npe) {
        } catch (Exception ex) {
            Logger.getLogger(FormIsiNilai.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadDataNilai() {
        for (Nilai aNilai : listNilai) {
            Object[] value = {aNilai.getKeterangan().getMateri().getNama(), aNilai.getKeterangan().getNamaKeterangan(), aNilai.getSkor()};
            control.getDefaultTableModel().addRow(value);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbkPeserta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKeterangan;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
