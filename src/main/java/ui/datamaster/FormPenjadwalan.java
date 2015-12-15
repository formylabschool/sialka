/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.datamaster;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import configuration.HIbernateUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Instruktur;
import model.Jadwal;
import model.Kelas;
import model.Materi;
import model.Ruangan;
import service.ServiceOfInstruktur;
import service.ServiceOfJadwal;
import service.ServiceOfKelas;
import service.ServiceOfNilai;
import service.ServiceOfRuangan;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class FormPenjadwalan extends javax.swing.JInternalFrame {
	private List<Kelas> listKelas;
	private List<Ruangan> listRuangan;
	private List<Instruktur> listInstruktur;
	private List<Materi> materi;

	/**
	 * Creates new form FormPenjadwalan
	 */
	public FormPenjadwalan() {
		initComponents();
		initComboKelas();
		initComboRuangan();
		initComboNII();
                cbkMateri.removeAllItems();
	}

	public void initComboKelas() {
		this.listKelas = new ServiceOfKelas(HIbernateUtil.config()).findAll();

		cbkKelas.removeAllItems();
		for (Kelas aKelas : listKelas) {

			cbkKelas.addItem(aKelas.getKodeKelas());

		}
		cbkKelas.setSelectedIndex(-1);
	}

	public void initComboRuangan() {
		this.listRuangan = new ServiceOfRuangan(HIbernateUtil.config()).findAll();
		cbkRuangan.removeAllItems();
		for (Ruangan aRuangan : listRuangan) {
			cbkRuangan.addItem(aRuangan.getId());
		}
		cbkRuangan.setSelectedIndex(-1);
	}

	public void initComboNII() {
		this.listInstruktur = new ServiceOfInstruktur(HIbernateUtil.config()).findAll();
		cbkNII.removeAllItems();
		for (Instruktur aInstruktur : listInstruktur) {
			cbkNII.addItem(aInstruktur.getNip());
		}
		cbkNII.setSelectedIndex(-1);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbkKelas = new javax.swing.JComboBox();
        dateChooser = new com.toedter.calendar.JDateChooser();
        cbkRuangan = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        sAwal = new javax.swing.JSpinner();
        sAkhir = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbkNII = new javax.swing.JComboBox();
        txtNII = new javax.swing.JTextField();
        cbkMateri = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Penjadwalan"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel1.setText("Kode Kelas");

        jLabel2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel2.setText("Tanggal");

        jLabel3.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel3.setText("Ruangan");

        jLabel9.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel9.setText("Jam Awal");

        jLabel10.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel10.setText("Jam Akhir");

        cbkKelas.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkKelas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkKelasItemStateChanged(evt);
            }
        });
        cbkKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkKelasActionPerformed(evt);
            }
        });

        dateChooser.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        cbkRuangan.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkRuangan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Nama Kelas");

        txtKelas.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        sAwal.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        sAwal.setModel(new javax.swing.SpinnerNumberModel());
        SpinnerDateModel spinnermodel = new SpinnerDateModel();
        spinnermodel.setCalendarField(Calendar.MINUTE);
        sAwal .setModel(spinnermodel);
        sAwal .setEditor(new JSpinner.DateEditor(sAwal , "hh:mm:ss"));

        sAkhir.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));
        SpinnerDateModel spinnermodel1 = new SpinnerDateModel();
        spinnermodel1.setCalendarField(Calendar.MINUTE);
        sAkhir .setModel(spinnermodel1);
        sAkhir .setEditor(new JSpinner.DateEditor(sAkhir , "hh:mm:ss"));
        sAkhir.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbkRuangan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbkKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sAwal)
                        .addComponent(sAkhir))
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbkKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbkRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel5.setText("NII");

        jLabel6.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel6.setText("Nama Instruktur");

        jLabel7.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel7.setText("Kode Materi");

        cbkNII.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkNII.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkNII.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkNIIItemStateChanged(evt);
            }
        });
        cbkNII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkNIIActionPerformed(evt);
            }
        });

        txtNII.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        cbkMateri.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkMateri.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbkMateri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbkNII, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNII, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbkNII, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNII, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbkMateri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("||Penjadwalan||");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnTambah.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnTambah))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnKeluar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnTambah)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeluar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbkNIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkNIIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbkNIIActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        Jadwal aJadwal = new Jadwal();
        aJadwal.setKelas(listKelas.get(cbkKelas.getSelectedIndex()));
        aJadwal.setInstruktur(listInstruktur.get(cbkNII.getSelectedIndex()));
        aJadwal.setRuangan(listRuangan.get(cbkRuangan.getSelectedIndex()));
        aJadwal.setMateri(materi.get(cbkMateri.getSelectedIndex()));
        aJadwal.setJam_awal((Date) sAwal.getValue());
        aJadwal.setJam_akhir((Date) sAkhir.getValue());
        aJadwal.setTanggal(java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(dateChooser.getDate())));
        
        ServiceOfJadwal service = new ServiceOfJadwal(HIbernateUtil.config());
        service.doSave(aJadwal);
                
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

	private void cbkKelasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbkKelasActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cbkKelasActionPerformed

	private void cbkKelasItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbkKelasItemStateChanged
		// TODO add your handling code here:
            cbkMateri.removeAllItems();
		if (cbkKelas.getSelectedIndex() >= 0) {
			Kelas kelas = listKelas.get(cbkKelas.getSelectedIndex());
			ServiceOfNilai nilai = new ServiceOfNilai();
			nilai.setSessionFactory(HIbernateUtil.config());
			try {
                           
				materi = nilai.findMateriByJurusan(kelas.getJurusan());
				
				for (Iterator iterator = materi.iterator(); iterator.hasNext();) {
					Materi aMateri = (Materi) iterator.next();
                                         
					//cbkMateri.addItem(aMateri.getId() + " " + aMateri.getNama());
                                       cbkMateri.addItem(aMateri.getNama());
                                        
				}
                                
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			txtKelas.setText(kelas.getNamaKelas());
		} else {
			txtKelas.setText("");
		}
	}// GEN-LAST:event_cbkKelasItemStateChanged

	private void cbkNIIItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbkNIIItemStateChanged
		// TODO add your handling code here:
		if (cbkNII.getSelectedIndex() >= 0) {
			Instruktur instruktur = listInstruktur.get(cbkNII.getSelectedIndex());
			txtNII.setText(instruktur.getNama());
		} else {
			txtNII.setText("");
		}
	}// GEN-LAST:event_cbkNIIItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cbkKelas;
    private javax.swing.JComboBox cbkMateri;
    private javax.swing.JComboBox cbkNII;
    private javax.swing.JComboBox cbkRuangan;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner sAkhir;
    private javax.swing.JSpinner sAwal;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNII;
    // End of variables declaration//GEN-END:variables
}
