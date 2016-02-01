/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.datamaster;

import configuration.HIbernateUtil;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Jurusan;
import model.Kelas;
import model.Siswa;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import org.hibernate.SessionFactory;
import service.ServiceOfKelas;
import service.ServiceOfNilai;
import service.ServiceOfSiswa;
import service.ValidateEmail;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class FormPendaftaran extends javax.swing.JInternalFrame {

    private List<Jurusan> listJurusan;
    private List<Kelas> listKelas;

    /**
     * Creates new form FormPendaftaran
     */
    public FormPendaftaran() {
        initComponents();
        // initCombo();
        initCombox();
        dateChooser.setDate(new Date());

    }

    public void converCurrency() {
        double money = 100.1;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(money);
    }

    public int hitungUmur() {
        Date lahir = dateLahir.getDate();
        SimpleDateFormat convert = new SimpleDateFormat("yyyy");
        Integer yearPilih = Integer.valueOf(convert.format(lahir));
        Integer umur = Year.now().getValue() - yearPilih;
        return umur;
    }

    public void initCombox() {
        this.listKelas = new ServiceOfKelas(HIbernateUtil.config()).findAll();
        cbkKelas.removeAllItems();
        for (Kelas aKelas : listKelas) {
            cbkKelas.addItem(aKelas.getKodeKelas());
        }
        cbkKelas.setSelectedIndex(-1);

    }

    private void printKwitansi(String genID, Siswa siswa) throws JRException {
        HashMap<String, Object> noSiswa = new HashMap<String, Object>();
        Kelas kelas = listKelas.get(cbkKelas.getSelectedIndex());
        noSiswa.put("no_reg", genID);
        noSiswa.put("namaSiswa", siswa.getNama());
        noSiswa.put("namaPelatihan", kelas.getNamaKelas());
        // noSiswa.put("harga", jTextField3.getText());
        noSiswa.put("harga", sHarga.getValue());
        noSiswa.put("totalPembayaran", txtHarga.getText());
        JasperDesign design = JRXmlLoader.load(getClass().getResourceAsStream("/kwitansi_pendaftaran.jrxml"));
        JasperReport report = JasperCompileManager.compileReport(design);
        JasperPrint print = JasperFillManager.fillReport(report, noSiswa, new JREmptyDataSource());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        txtHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbkGel = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtAjaran = new javax.swing.JTextField();
        cbkKelas = new javax.swing.JComboBox();
        sHarga = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtTempatLahir = new javax.swing.JTextField();
        cbkPT = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtKontak = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAlamat = new javax.swing.JTextArea();
        dateLahir = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        cbkJK = new javax.swing.JComboBox();
        txtValidate = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Pendaftaran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Menlo", 0, 13))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel2.setText("Tanggal");

        jLabel3.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel3.setText("Kelas");

        jLabel4.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel4.setText("Harga");

        dateChooser.setDateFormatString("dd MMMM yyyy");
        dateChooser.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        txtHarga.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel6.setText("Uang Pendaftaran");

        jLabel7.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel7.setText("Gelombang");

        cbkGel.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkGel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=", "1", "2", "3", "4" }));
        cbkGel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkGelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel1.setText("Tahun Ajaran");

        txtAjaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAjaranActionPerformed(evt);
            }
        });

        cbkKelas.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbkKelas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbkKelasItemStateChanged(evt);
            }
        });

        sHarga.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        sHarga.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(10000.0d), null, null, Double.valueOf(10000.0d)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAjaran, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbkGel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbkKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(254, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAjaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbkGel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbkKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(sHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Siswa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Menlo", 0, 13))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel5.setText("Nama Lengkap");

        jLabel8.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel8.setText("Tempat, Tanggal Lahir");

        jLabel9.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel9.setText("Pendidikan Terakhir");

        jLabel10.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel10.setText("Alamat");

        txtNama.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        txtTempatLahir.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N

        cbkPT.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkPT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=", "SD", "SMP", "SMA", "Perguruan Tinggi", "Lainnya" }));

        jLabel11.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel11.setText("Kontak");

        jLabel12.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel12.setText("E-mail");

        txtKontak.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        txtKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKontakActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txaAlamat.setColumns(20);
        txaAlamat.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        txaAlamat.setRows(5);
        jScrollPane1.setViewportView(txaAlamat);

        dateLahir.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        dateLahir.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                dateLahirInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        dateLahir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateLahirPropertyChange(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel14.setText("Jenis Kelamin");

        cbkJK.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        cbkJK.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Pilih=", "L", "P" }));

        txtValidate.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        txtValidate.setText("example@domain.com");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbkJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbkPT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtKontak)
                                    .addComponent(txtEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValidate)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtTempatLahir)
                                    .addComponent(txtNama))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateLahir, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbkJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbkPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtKontak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidate))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        btnKeluar.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel13.setText("Mohon untuk mengecek kembali data sebelum di simpan !");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("||Pendaftaran||");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel15)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKeluar)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(15, 15, 15))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKeluar)
                            .addComponent(btnSimpan)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void cbkGelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkGelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbkGelActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            // TODO add your handling code here:
            Siswa aSiswa = new Siswa();
//        aSiswa.setJurusan(listJurusan.get(cbkJurusan.getSelectedIndex()));
//        aSiswa.setHargaTotal(aSiswa.getJurusan().getHarga());
            aSiswa.setKelas(listKelas.get(cbkKelas.getSelectedIndex()));
            aSiswa.setHargaTotal(aSiswa.getKelas().getJurusan().getHarga());
            aSiswa.setSisa(aSiswa.getHargaTotal());
            aSiswa.setTanggalPendaftaran(dateChooser.getDate());
            aSiswa.setNama(txtNama.getText());
            aSiswa.setTempatLahir(txtTempatLahir.getText());
            aSiswa.setTanggalLahir(dateLahir.getDate());
            aSiswa.setJenisKelamin((String) cbkJK.getSelectedItem());
            aSiswa.setPendidikanTerakhir((String) cbkPT.getSelectedItem());
            aSiswa.setKontak(txtKontak.getText());
            aSiswa.setEmail(txtEmail.getText());
            aSiswa.setAlamat(txaAlamat.getText());
            aSiswa.setTahunAjaran(txtAjaran.getText());
            aSiswa.setLunas(false);
            aSiswa.setKodeSiswa("-");
            SessionFactory aSessionFactory = HIbernateUtil.config();
            ServiceOfSiswa serviceOfSiswa = new ServiceOfSiswa(aSessionFactory);
            ServiceOfNilai serviceNilai = new ServiceOfNilai(aSessionFactory);
            if (hitungUmur() <= 18) {
                JOptionPane.showMessageDialog(getRootPane(), "Maaf umur anda belum mencukupi", "INFORMASI", JOptionPane.WARNING_MESSAGE);
            } else {
                serviceOfSiswa.doSave(aSiswa);
                aSiswa.setKodeSiswa(generateKode(aSiswa.getId()));

                serviceOfSiswa = new ServiceOfSiswa(aSessionFactory);
                serviceOfSiswa.doUpdate(aSiswa);
                serviceNilai.setNilai(aSiswa.getKelas().getJurusan(), aSiswa);
                try {
                    printKwitansi(aSiswa.getKodeSiswa(), aSiswa);
                } catch (JRException ex) {
                    Logger.getLogger(FormPendaftaran.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();

            }

        } catch (Exception ex) {
            Logger.getLogger(FormPendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtAjaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAjaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAjaranActionPerformed

    private void txtKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKontakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKontakActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void cbkKelasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbkKelasItemStateChanged
        // TODO add your handling code here:
        if (cbkKelas.getSelectedIndex() >= 0) {
            Kelas kelas = listKelas.get(cbkKelas.getSelectedIndex());
            //  jHarga.setValue(kelas.getJurusan().getHarga());
            double money = kelas.getJurusan().getHarga();
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String moneyString = formatter.format(money);
          //  txtHarga.setText(kelas.getJurusan().getHarga().toString());
            txtHarga.setText(moneyString); 
       } else {
            txtHarga.setText("0");
            // jHarga.setValue("0");
        }

    }//GEN-LAST:event_cbkKelasItemStateChanged

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        boolean status = ValidateEmail.validateEmail(txtEmail.getText());
        if (status) {
            txtValidate.setText("email valid");
        } else {
            txtValidate.setText("not valid email");
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void dateLahirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateLahirPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_dateLahirPropertyChange

    private void dateLahirInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dateLahirInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_dateLahirInputMethodTextChanged

    public static String value(Number value) {
        StringBuilder aBuilder = new StringBuilder();
        if (value.toString().length() == 1) {
            aBuilder.append("00").append(value);
        } else if (value.toString().length() == 2) {
            aBuilder.append("0").append(value);
        } else if (value.toString().length() == 3) {
            aBuilder.append(value);
        }
        return aBuilder.toString();

    }

    private String generateKode(Integer value) {
        StringBuilder aBuilder = new StringBuilder();
        aBuilder.append(cbkGel.getSelectedItem().toString());
        aBuilder.append(listKelas.get(cbkKelas.getSelectedIndex()).getJurusan().getKodeJurusan());
        aBuilder.append(Year.now().getValue());
        aBuilder.append(value(value));
        return aBuilder.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cbkGel;
    private javax.swing.JComboBox cbkJK;
    private javax.swing.JComboBox cbkKelas;
    private javax.swing.JComboBox cbkPT;
    private com.toedter.calendar.JDateChooser dateChooser;
    private com.toedter.calendar.JDateChooser dateLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner sHarga;
    private javax.swing.JTextArea txaAlamat;
    private javax.swing.JTextField txtAjaran;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKontak;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTempatLahir;
    private javax.swing.JLabel txtValidate;
    // End of variables declaration//GEN-END:variables
}
