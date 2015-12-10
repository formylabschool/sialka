/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import configuration.HIbernateUtil;
import controllers.ControllersOfNilai;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Materi;
import model.Siswa;
import service.ServiceOfNilai;
import service.ServiceOfSiswa;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class FormPenilaian extends javax.swing.JInternalFrame {

    private List<Siswa> listSiswa;
    private ControllersOfNilai controllerNilai;
    

    /**
     * Creates new form FormPenilaian
     */
    public FormPenilaian() {
        initComponents();
        initCombo();
        this.controllerNilai = new ControllersOfNilai();
        this.controllerNilai.inijectTable((DefaultTableModel) tablePenilaian.getModel());
    }

    public void initCombo() {
        this.listSiswa = new ServiceOfSiswa(HIbernateUtil.config()).findAll();

        cbkNIP.removeAllItems();
        for (Siswa aSiswa : listSiswa) {

            cbkNIP.addItem(aSiswa.getKodeSiswa());

        }
        cbkNIP.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbkNIP = new javax.swing.JComboBox();
        txtNIP = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePenilaian = new javax.swing.JTable();

        jLabel1.setText("No Induk");

        jLabel2.setText("Nama");

        cbkNIP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkNIP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkNIPItemStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Penilaian"));

        tablePenilaian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Materi", "Nama Materi", "Keterangan", "Skor"
            }
        ));
        jScrollPane1.setViewportView(tablePenilaian);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbkNIP, 0, 156, Short.MAX_VALUE)
                            .addComponent(txtNIP))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbkNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbkNIPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkNIPItemStateChanged
        // TODO add your handling code here:
        try {
            if (cbkNIP.getSelectedIndex() >= 0) {
                Siswa siswa = listSiswa.get(cbkNIP.getSelectedIndex());
                txtNIP.setText(siswa.getNama());
              //  System.out.println(siswa.getJurusan());
                ServiceOfNilai service = new ServiceOfNilai();
                service.setSessionFactory(HIbernateUtil.config());

                List<Materi> materi;
                try {
                    controllerNilai.initTable();
                    materi = service.findMateriByJurusan(siswa.getKelas().getJurusan());
                    System.out.println("jumlah data materi ditemukan "+materi.size());
                    for (Materi aMateri : materi) {
                        for (int i = 0; i < aMateri.getKeterangan().size(); i++) {
                            System.out.println(aMateri.getNama()+", "+aMateri.getKeterangan().get(i));
                            Object[] values = {aMateri.getKodeMateri(),aMateri.getNama(),aMateri.getKeterangan().get(i),0};
                            controllerNilai.getDefaultTableModel().addRow(values);
                        }
                    }

                } catch (Exception ex) {
                    Logger.getLogger(FormPenilaian.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                txtNIP.setText("");
            }
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
    }//GEN-LAST:event_cbkNIPItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbkNIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePenilaian;
    private javax.swing.JTextField txtNIP;
    // End of variables declaration//GEN-END:variables
}
