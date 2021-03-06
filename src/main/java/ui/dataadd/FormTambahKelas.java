/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.dataadd;

import configuration.HIbernateUtil;
import controllers.ControllersOfKelas;
import controllers.ControllersOfMateri;
import java.util.List;
import javax.swing.JOptionPane;
import model.Jurusan;
import model.Kelas;
import model.Materi;
import org.hibernate.SessionFactory;
import service.ServiceOfJurusan;
import service.ServiceOfKelas;
import service.ServiceOfMateri;
import ui.datamaster.FormKelas;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class FormTambahKelas extends javax.swing.JDialog {

    private ControllersOfKelas controller;
    private FormKelas menu;
    private Boolean update;
    private Kelas model;
    private SessionFactory aSessionFactory;
    private List<Jurusan> listJurusan;

    /**
     * Creates new form FormTambahKelas
     */
    public FormTambahKelas(java.awt.Frame parent, boolean modal, FormKelas aThis) {
        super(parent, modal);
        initComponents();
        initCombo();
        this.model = new Kelas();
        setUpdate(false);
        this.menu = aThis;
        this.controller = new ControllersOfKelas();
        this.setLocationRelativeTo(this);
        this.setAlwaysOnTop(true);
    }

    FormTambahKelas(java.awt.Frame object, boolean b, FormKelas aThis, Kelas Model) {
        super(object, b);
        setUpdate(true);
        initComponents();
        initCombo();
        this.menu = aThis;
        this.controller = new ControllersOfKelas();
        this.model = model;

        cbkJurusan.setSelectedItem(model.getJurusan().getNama());
    }

    private void initCombo() {
        this.listJurusan = new ServiceOfJurusan(HIbernateUtil.config()).findAll();
        cbkJurusan.removeAllItems();
        for (Jurusan aJurusan : listJurusan) {
            cbkJurusan.addItem(aJurusan.getNama());
        }
    }

    private void setUpdate(Boolean update) {
        this.update = update;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKodeKelas = new javax.swing.JTextField();
        txtNamaKelas = new javax.swing.JTextField();
        cbkJurusan = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel1.setText("Kode Kelas");

        jLabel2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel2.setText("Nama Kelas");

        jLabel3.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel3.setText("Jurusan");

        txtKodeKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeKelasActionPerformed(evt);
            }
        });

        txtNamaKelas.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        cbkJurusan.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkJurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel4.setText("Periode");

        txtTahun.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKodeKelas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNamaKelas)
                            .addComponent(cbkJurusan, 0, 211, Short.MAX_VALUE)
                            .addComponent(txtTahun))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKodeKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbkJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        btnSimpan.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnSimpan.setIcon(new javax.swing.ImageIcon("/Users/muhamadhanifmuhsin/NetBeansProjects/SIALKA/src/main/resources/icon/save-file.png")); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("||Data Kelas||");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSimpan)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if (update) {
            try {
                ServiceOfKelas service = new ServiceOfKelas(HIbernateUtil.config());
                model.setKodeKelas(txtKodeKelas.getText());
                model.setNamaKelas(txtNamaKelas.getText());
                model.setPeriode(txtTahun.getText());

                model.setJurusan(listJurusan.get(cbkJurusan.getSelectedIndex()));

                service.doUpdate(model);

                this.menu.refreshTable();

                dispose();
            } catch (Exception e) {
                e.printStackTrace();

            }
        } else {
            try {
                ServiceOfKelas service = new ServiceOfKelas(HIbernateUtil.config());
                model.setKodeKelas(txtKodeKelas.getText());
                model.setNamaKelas(txtNamaKelas.getText());
                model.setPeriode(txtTahun.getText());

                model.setJurusan(listJurusan.get(cbkJurusan.getSelectedIndex()));
                service.doSave(model);
                this.menu.refreshTable();
                dispose();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtKodeKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeKelasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cbkJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtKodeKelas;
    private javax.swing.JTextField txtNamaKelas;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
