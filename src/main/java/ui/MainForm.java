/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import ui.datamaster.FormPendaftaran;
import ui.datamaster.FormBukuTamu;
import ui.datamaster.FormPenjadwalan;
import ui.datamaster.FormDataAbsensi;
import ui.datamaster.FormDataPembayaran;
import ui.datamaster.FormPenilaian;
import ui.datamaster.FormDataKelas;
import ui.datamaster.FormKelas;
import ui.datamaster.FormDataKeuanganSiswa;
import ui.datamaster.FormPembayaran;
import ui.datamaster.FormSiswa;
import ui.dataadd.FormAbsensi;
import ui.datamaster.FormMateri;
import ui.datamaster.FormInstruktur;
import ui.datamaster.FormRuangan;
import ui.datamaster.FormJurusan;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import ui.rekapitulation.RekapJadwal;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAkses = new javax.swing.JMenu();
        mniMasuk = new javax.swing.JMenuItem();
        mniKeluar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniMatikan = new javax.swing.JMenuItem();
        mniAbsensi = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        mniBukuTamu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniRegistrasi = new javax.swing.JMenuItem();
        mniDataAbsensi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniDaftarSiswa = new javax.swing.JMenuItem();
        mniDataNilaiSiswa = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnuKeuangan = new javax.swing.JMenu();
        mniPemBulanan = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuKurikulum = new javax.swing.JMenu();
        mniInstruktur = new javax.swing.JMenuItem();
        mniMateri = new javax.swing.JMenuItem();
        mniRuangan = new javax.swing.JMenuItem();
        mniJurusan = new javax.swing.JMenuItem();
        mniKelas = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEM INFORMASI AKADEMIK LPK KANIRA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        desktop.setBackground(new java.awt.Color(204, 204, 204));

        mnuAkses.setText("Akses");
        mnuAkses.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N

        mniMasuk.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniMasuk.setText("Masuk");
        mniMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMasukActionPerformed(evt);
            }
        });
        mnuAkses.add(mniMasuk);

        mniKeluar.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniKeluar.setText("Keluar");
        mnuAkses.add(mniKeluar);
        mnuAkses.add(jSeparator1);

        mniMatikan.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniMatikan.setText("Matikan");
        mniMatikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMatikanActionPerformed(evt);
            }
        });
        mnuAkses.add(mniMatikan);

        jMenuBar1.add(mnuAkses);

        mniAbsensi.setText("Administrasi");
        mniAbsensi.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        jMenuItem4.setText("Absensi");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mniAbsensi.add(jMenuItem4);

        mniBukuTamu.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniBukuTamu.setText("Buku Tamu");
        mniBukuTamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBukuTamuActionPerformed(evt);
            }
        });
        mniAbsensi.add(mniBukuTamu);
        mniAbsensi.add(jSeparator2);

        mniRegistrasi.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniRegistrasi.setText("Pendaftaran");
        mniRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegistrasiActionPerformed(evt);
            }
        });
        mniAbsensi.add(mniRegistrasi);

        mniDataAbsensi.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniDataAbsensi.setText("Data Absensi");
        mniDataAbsensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDataAbsensiActionPerformed(evt);
            }
        });
        mniAbsensi.add(mniDataAbsensi);

        jMenuBar1.add(mniAbsensi);

        jMenu2.setText("Data Siswa");
        jMenu2.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N

        mniDaftarSiswa.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniDaftarSiswa.setText("Daftar Siswa ");
        mniDaftarSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDaftarSiswaActionPerformed(evt);
            }
        });
        jMenu2.add(mniDaftarSiswa);

        mniDataNilaiSiswa.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniDataNilaiSiswa.setText("Data Nilai Siswa");
        mniDataNilaiSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDataNilaiSiswaActionPerformed(evt);
            }
        });
        jMenu2.add(mniDataNilaiSiswa);

        jMenuItem7.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        jMenuItem7.setText("Data Keuangan Siswa");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem9.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        jMenuItem9.setText("Daftar Siswa Per Kelas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        mnuKeuangan.setText("Keuangan");
        mnuKeuangan.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N

        mniPemBulanan.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniPemBulanan.setText("Pem.Pelatihan");
        mniPemBulanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPemBulananActionPerformed(evt);
            }
        });
        mnuKeuangan.add(mniPemBulanan);
        mnuKeuangan.add(jSeparator3);

        jMenuItem6.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        jMenuItem6.setText("Data Pembayaran");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnuKeuangan.add(jMenuItem6);

        jMenuBar1.add(mnuKeuangan);

        mnuKurikulum.setText("Kurikulum");
        mnuKurikulum.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N

        mniInstruktur.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniInstruktur.setText("Instruktur");
        mniInstruktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInstrukturActionPerformed(evt);
            }
        });
        mnuKurikulum.add(mniInstruktur);

        mniMateri.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniMateri.setText("Materi");
        mniMateri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMateriActionPerformed(evt);
            }
        });
        mnuKurikulum.add(mniMateri);

        mniRuangan.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniRuangan.setText("Ruangan");
        mniRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRuanganActionPerformed(evt);
            }
        });
        mnuKurikulum.add(mniRuangan);

        mniJurusan.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniJurusan.setText("Jurusan");
        mniJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniJurusanActionPerformed(evt);
            }
        });
        mnuKurikulum.add(mniJurusan);

        mniKelas.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        mniKelas.setText("Kelas");
        mniKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKelasActionPerformed(evt);
            }
        });
        mnuKurikulum.add(mniKelas);

        jMenuItem8.setText("Penjadwalan");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        mnuKurikulum.add(jMenuItem8);

        jMenuBar1.add(mnuKurikulum);

        jMenu1.setText("Rekapitulasi");
        jMenu1.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        jMenuItem1.setText("Jadwal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void jendelaDalam(JInternalFrame frame) {

        frame.setVisible(true);
        frame.setResizable(true);
        desktop.add(frame);
        this.setContentPane(desktop);

    }


    private void mniMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniMasukActionPerformed

    private void mniInstrukturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInstrukturActionPerformed
        // TODO add your handling code here:
        FormInstruktur add = new FormInstruktur();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniInstrukturActionPerformed

    private void mniMatikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMatikanActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mniMatikanActionPerformed

    private void mniBukuTamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBukuTamuActionPerformed
        // TODO add your handling code here:
        FormBukuTamu add = new FormBukuTamu();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniBukuTamuActionPerformed

    private void mniRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistrasiActionPerformed
        // TODO add your handling code here:
        FormPendaftaran add = new FormPendaftaran();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniRegistrasiActionPerformed

    private void mniMateriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMateriActionPerformed
        // TODO add your handling code here:
        FormMateri add = new FormMateri();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniMateriActionPerformed

    private void mniRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRuanganActionPerformed
        // TODO add your handling code here:
        FormRuangan add = new FormRuangan();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniRuanganActionPerformed

    private void mniJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniJurusanActionPerformed
        // TODO add your handling code here:
        FormJurusan add = new FormJurusan();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniJurusanActionPerformed

    private void mniDaftarSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDaftarSiswaActionPerformed
        // TODO add your handling code here:
        FormSiswa add = new FormSiswa();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniDaftarSiswaActionPerformed

    private void mniDataNilaiSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDataNilaiSiswaActionPerformed
        // TODO add your handling code here:
        FormPenilaian add = new FormPenilaian();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniDataNilaiSiswaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        FormAbsensi add = new FormAbsensi();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mniPemBulananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPemBulananActionPerformed
        // TODO add your handling code here:
        FormPembayaran add = new FormPembayaran();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniPemBulananActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        FormDataPembayaran add = new FormDataPembayaran();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mniDataAbsensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDataAbsensiActionPerformed
        // TODO add your handling code here:
        FormDataAbsensi add = new FormDataAbsensi();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniDataAbsensiActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        FormDataKeuanganSiswa add = new FormDataKeuanganSiswa();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);


    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void mniKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKelasActionPerformed
        // TODO add your handling code here:
        FormKelas add = new FormKelas();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_mniKelasActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        FormPenjadwalan add = new FormPenjadwalan();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        FormDataKelas add = new FormDataKelas();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        RekapJadwal add = new RekapJadwal();
        desktop.add(add);

        Dimension size = desktop.getSize();
        Dimension addSize = add.getSize();
        add.setLocation((size.width - addSize.width) / 2,
                (size.height - addSize.height) / 2);
        add.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu mniAbsensi;
    private javax.swing.JMenuItem mniBukuTamu;
    private javax.swing.JMenuItem mniDaftarSiswa;
    private javax.swing.JMenuItem mniDataAbsensi;
    private javax.swing.JMenuItem mniDataNilaiSiswa;
    private javax.swing.JMenuItem mniInstruktur;
    private javax.swing.JMenuItem mniJurusan;
    private javax.swing.JMenuItem mniKelas;
    private javax.swing.JMenuItem mniKeluar;
    private javax.swing.JMenuItem mniMasuk;
    private javax.swing.JMenuItem mniMateri;
    private javax.swing.JMenuItem mniMatikan;
    private javax.swing.JMenuItem mniPemBulanan;
    private javax.swing.JMenuItem mniRegistrasi;
    private javax.swing.JMenuItem mniRuangan;
    private javax.swing.JMenu mnuAkses;
    private javax.swing.JMenu mnuKeuangan;
    private javax.swing.JMenu mnuKurikulum;
    // End of variables declaration//GEN-END:variables
}
