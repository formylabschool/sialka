/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.rekapitulation;

import configuration.HIbernateUtil;
import controllers.ControllersOfInstruktur;
import controllers.ControllersOfKelas;
import controllers.ControllersOfPenjadwalan;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Instruktur;
import model.Jadwal;
import model.Kelas;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import service.ServiceOfInstruktur;
import service.ServiceOfJadwal;
import service.ServiceOfKelas;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class RekapJadwalInstruktur extends javax.swing.JInternalFrame {

    private List<Kelas> listKelas = new ArrayList<>();
    private List<Instruktur> listInstruktur = new ArrayList<>();
    private List<Jadwal> listJadwal = new ArrayList<>();
    private ServiceOfInstruktur serviceInstruktur;
    private ServiceOfKelas serviceOfKelas;
    private ServiceOfJadwal serviceOfJadwal;
    private ControllersOfKelas controllKelas;
    private ControllersOfInstruktur controllIntruktur;
    private ControllersOfPenjadwalan control;

    /**
     * Creates new form RekapJadwalInstruktur
     */
    public RekapJadwalInstruktur() {
        initComponents();
        controllIntruktur = new ControllersOfInstruktur();
        controllKelas = new ControllersOfKelas();
        control = new ControllersOfPenjadwalan();
        serviceOfJadwal = new ServiceOfJadwal(HIbernateUtil.config());
        this.control.inijectTable((DefaultTableModel) tableJadwal.getModel());
        initComboKelas();
        initComboInstruktur();
    }

    public void initComboKelas() {
        this.listKelas = new ServiceOfKelas(HIbernateUtil.config()).findAll();
        cbkKelas.removeAllItems();
        for (Kelas aKelas : listKelas) {
            cbkKelas.addItem(aKelas.getKodeKelas());
        }
        cbkKelas.setSelectedIndex(-1);
    }

    public void initComboInstruktur() {
        this.listInstruktur = new ServiceOfInstruktur(HIbernateUtil.config()).findAll();
        cbkInstruktur.removeAllItems();
        for (Instruktur aInstruktur : listInstruktur) {
            cbkInstruktur.addItem(aInstruktur.getNii());
        }
        cbkInstruktur.setSelectedIndex(-1);
    }

    private void printJadwalInstruktur(List<Jadwal> listJadwal, java.util.Date date1, java.util.Date date2) throws JRException {
        HashMap<String, Object> jadwalInstrukturMap = new HashMap<String, Object>();
        List<Jadwal> emptyListJadwal = new ArrayList<>();
        Instruktur instruktur = listInstruktur.get(cbkInstruktur.getSelectedIndex());
        for (Jadwal jadwal : listJadwal) {
            
            DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
            java.sql.Date sqlValueDate = java.sql.Date.valueOf(formater.format(jadwal.getTanggal()));
            java.sql.Date sqlBeforeDate = java.sql.Date.valueOf(formater.format(date1));
            java.sql.Date sqlAfterDate = java.sql.Date.valueOf(formater.format(date2));
            
            LocalDate value = sqlValueDate.toLocalDate();
            LocalDate dateAfter = sqlAfterDate.toLocalDate();
            LocalDate dateBefore = sqlBeforeDate.toLocalDate();
            System.out.println(jadwal.getTanggal()+" available");
            
            if(value.isBefore(dateAfter.plusDays(1)) && value.isAfter(dateBefore.minusDays(1))){
                emptyListJadwal.add(jadwal);
            }else{
            }
        }
        jadwalInstrukturMap.put("kodeInstruktur", instruktur.getNii());
        jadwalInstrukturMap.put("namaInstruktur", txtNamaInstruktur.getText());
        jadwalInstrukturMap.put("tanggalAwal", date1);
        jadwalInstrukturMap.put("tanggalAkhir", date2);
        Kelas kelas = listKelas.get(cbkKelas.getSelectedIndex());
        jadwalInstrukturMap.put("kodeKelas", kelas.getKodeKelas());
        jadwalInstrukturMap.put("namaKelas", txtNamaKelas.getText());
        JasperDesign design = JRXmlLoader.load(getClass().getResourceAsStream("/jadwal_instruktur.jrxml"));
        JasperReport report = JasperCompileManager.compileReport(design);
        JasperPrint print = JasperFillManager.fillReport(report, jadwalInstrukturMap, new JRBeanCollectionDataSource(emptyListJadwal));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbkKelas = new javax.swing.JComboBox();
        txtNamaKelas = new javax.swing.JTextField();
        cbkInstruktur = new javax.swing.JComboBox();
        txtNamaInstruktur = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJadwal = new javax.swing.JTable();
        btnKeluar = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        date2 = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel1.setText("Kelas");

        jLabel2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel3.setText("Instruktur");

        jLabel4.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel4.setText("Nama");

        cbkKelas.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkKelas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkKelasItemStateChanged(evt);
            }
        });

        txtNamaKelas.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        txtNamaKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaKelasActionPerformed(evt);
            }
        });

        cbkInstruktur.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkInstruktur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkInstruktur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkInstrukturItemStateChanged(evt);
            }
        });

        txtNamaInstruktur.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("||Jadwal Per Instruktur||");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnCari.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnCari.setIcon(new javax.swing.ImageIcon("/Users/muhamadhanifmuhsin/NetBeansProjects/SIALKA/src/main/resources/icon/search.png")); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableJadwal.setFont(new java.awt.Font("Menlo", 0, 12)); // NOI18N
        tableJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "Ruangan", "Jam ", "Materi", "Instruktur"
            }
        ));
        jScrollPane1.setViewportView(tableJadwal);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnKeluar.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnKeluar.setIcon(new javax.swing.ImageIcon("/Users/muhamadhanifmuhsin/NetBeansProjects/SIALKA/src/main/resources/icon/exit.png")); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel8.setText("Cetak Jadwal");

        date1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel7.setText("Sampai");

        date2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbkKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbkInstruktur, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaInstruktur, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKeluar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbkKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbkInstruktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNamaInstruktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnKeluar)
                        .addComponent(btnPrint)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7))
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaKelasActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        try {
            control.initTable();
            Kelas kelas = listKelas.get(cbkKelas.getSelectedIndex());
            Instruktur instruktur = listInstruktur.get(cbkInstruktur.getSelectedIndex());
            listJadwal = serviceOfJadwal.findJadwalByInstruktur(kelas, instruktur);
            System.out.println("jumlah data jadwal" + listJadwal.size());
            for (Jadwal aJadwal : listJadwal) {

                Object[] value = {aJadwal.getTanggal(), aJadwal.getRuangan().getId(), aJadwal.getJam()
                   , aJadwal.getMateri().getNama(), aJadwal.getInstruktur().getNama()};
                control.getDefaultTableModel().addRow(value);
            }

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void cbkKelasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkKelasItemStateChanged
        // TODO add your handling code here:
        if (cbkKelas.getSelectedItem() != null) {
            Kelas kelas = listKelas.get(cbkKelas.getSelectedIndex());
            txtNamaKelas.setText(kelas.getNamaKelas());
        } else {
            txtNamaKelas.setText("");
        }
    }//GEN-LAST:event_cbkKelasItemStateChanged

    private void cbkInstrukturItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkInstrukturItemStateChanged
        // TODO add your handling code here:
        if (cbkInstruktur.getSelectedItem() != null) {
            Instruktur instruktur = listInstruktur.get(cbkInstruktur.getSelectedIndex());
            txtNamaInstruktur.setText(instruktur.getNama());
        } else {
            txtNamaInstruktur.setText("");
        }
    }//GEN-LAST:event_cbkInstrukturItemStateChanged

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            // TODO add your handling code here:

            printJadwalInstruktur(listJadwal, date1.getDate(), date2.getDate());
        } catch (JRException ex) {
            Logger.getLogger(RekapJadwalInstruktur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox cbkInstruktur;
    private javax.swing.JComboBox cbkKelas;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableJadwal;
    private javax.swing.JTextField txtNamaInstruktur;
    private javax.swing.JTextField txtNamaKelas;
    // End of variables declaration//GEN-END:variables
}
