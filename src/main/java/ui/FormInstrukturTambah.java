/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import configuration.HIbernateUtil;
import controllers.ControllersOfCourses;
import controllers.ControllersOfInstruktur;
import controllers.ControllersOfRuangan;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Instruktur;
import service.ServiceOfInstruktur;
import service.ServiceOfRuangan;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class FormInstrukturTambah extends javax.swing.JDialog {

    private ControllersOfInstruktur controllers;
    private final FormInstruktur menu;
    private Boolean update;
    private Instruktur model;

    /**
     * Creates new form FormInstrukturTambah
     */
    private void setUpdate(Boolean update) {
        this.update = update;
    }

    public FormInstrukturTambah(java.awt.Frame parent, boolean modal, FormInstruktur aThis) {
        super(parent, modal);
        initComponents();
        this.model = new Instruktur();
        setUpdate(false);
        this.menu = aThis;
        this.controllers = new ControllersOfInstruktur();
    }

    public FormInstrukturTambah(java.awt.Frame object, boolean b, FormInstruktur aThis, Instruktur model) {
        super(object, b);
        setUpdate(true);
        initComponents();
        this.menu = aThis;
        this.controllers = new ControllersOfInstruktur();
        this.model = model;
        txtNIP.setText(model.getNip());
        txtNama.setText(model.getNama());
        txtTempat.setText(model.getTempatLahir());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalLahir = format.format(dateChoose.getDate());
       // dateChoose.setDate(java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(model.getTanggalLahir())));
        // dateChoose.setDateFormatString(tanggalLahir);
        txtHP.setText(model.getKontak());
        txtEmail.setText(model.getEmail());
        txaAlamat.setText(model.getAlamat());
      //  dateChoose.setDateFormatString(model.getTanggalLahir());

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNIP = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTempat = new javax.swing.JTextField();
        dateChoose = new com.toedter.calendar.JDateChooser();
        txtHP = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAlamat = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Instruktur", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Menlo", 0, 13))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel1.setText("NIP");

        jLabel2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel2.setText("Nama Lengkap");

        jLabel3.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel3.setText("Tempat, Tanggal Lahir");

        jLabel4.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel4.setText("Hand Phone");

        jLabel5.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel5.setText("E-mail");

        txtNIP.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        txtNama.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        txtTempat.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        dateChoose.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        txtHP.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel6.setText("Alamat");

        txaAlamat.setColumns(20);
        txaAlamat.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        txaAlamat.setRows(5);
        jScrollPane1.setViewportView(txaAlamat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHP, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(txtTempat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtEmail)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSimpan.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if (update) {
            try {
                ServiceOfInstruktur service = new ServiceOfInstruktur(HIbernateUtil.config());
                model.setNip(txtNIP.getText());
                model.setNama(txtNama.getText());
                model.setTempatLahir(txtTempat.getText());
                model.setTanggalLahir(java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(dateChoose.getDate())));
                model.setKontak(txtHP.getText());
                model.setEmail(txtEmail.getText());
                model.setAlamat(txaAlamat.getText());
                service.doUpdate(model);

                this.menu.refreshTable();

                dispose();
            } catch (Exception e) {
                e.printStackTrace();

            }
        } else {
            try {
                ServiceOfInstruktur service = new ServiceOfInstruktur(HIbernateUtil.config());
                model.setNip(txtNIP.getText());
                model.setNama(txtNama.getText());
                model.setTempatLahir(txtTempat.getText());
                model.setTanggalLahir(java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(dateChoose.getDate())));
                model.setKontak(txtHP.getText());
                model.setEmail(txtEmail.getText());
                model.setAlamat(txaAlamat.getText());
                service.doSave(model);
                this.menu.refreshTable();
                dispose();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private com.toedter.calendar.JDateChooser dateChoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtNIP;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTempat;
    // End of variables declaration//GEN-END:variables
}
