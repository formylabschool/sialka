/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import configuration.HIbernateUtil;
import interfaces.JavaControllers;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Ruangan;
import model.Siswa;
import service.ServiceOfRuangan;
import service.ServiceOfSiswa;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfSiswa implements JavaControllers {

    private DefaultTableModel defaultTableModel;

    public void initTable() {
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }

    public void loadDataSiswa(List<Siswa> list) {
        initTable();
        ServiceOfSiswa service = new ServiceOfSiswa(HIbernateUtil.config());
        for (Siswa siswa : list) {
            Object[] anObjects = {siswa.getKodeSiswa(), siswa.getNama(), siswa.getTempatLahir(), siswa.getTanggalLahir(), siswa.getJenisKelamin(),
                siswa.getPendidikanTerakhir(), siswa.getKontak(), siswa.getEmail(), siswa.getAlamat(),siswa.getTahunAjaran()};
            this.defaultTableModel.addRow(anObjects);

        }

    }

    public void loadDataNilaiSiswa(List<Siswa> list) {
        initTable();
        ServiceOfSiswa serviceOfSiswa = new ServiceOfSiswa(HIbernateUtil.config());
        for (Siswa aSiswa : list) {
            Object[] aObjects = {aSiswa.getKodeSiswa(),aSiswa.getNama(),aSiswa.getNilai1(),aSiswa.getNilai2(),aSiswa.getNilai3()};
            this.defaultTableModel.addRow(aObjects);
        }

    }
    
     public void loadDataAbsen(List<Siswa> list) {
        initTable();
        ServiceOfSiswa serviceOfSiswa = new ServiceOfSiswa(HIbernateUtil.config());
        for (Siswa aSiswa : list) {
            Object[] aObjects = {aSiswa.getKodeSiswa(),aSiswa.getNama()};
            this.defaultTableModel.addRow(aObjects);
        }

    }
     
     public void loadDataKeuanganSiswa(List<Siswa>list){
          initTable();
        ServiceOfSiswa serviceOfSiswa = new ServiceOfSiswa(HIbernateUtil.config());
        for (Siswa aSiswa : list) {
            Object[] aObjects = {aSiswa.getKodeSiswa(),aSiswa.getSisa()};
            this.defaultTableModel.addRow(aObjects);
        }
     }

    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;

    }

}
