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
import model.Absensi;
import service.ServiceOfAbsensi;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfAbsensi implements JavaControllers{
     private DefaultTableModel defaultTableModel;
    
      public DefaultTableModel getDefaultTableModel() {
        return defaultTableModel;
    }

    public void initTable() {
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }
    
    public void loadDataAbsensi(List<Absensi>list){
        initTable();
        ServiceOfAbsensi service = new ServiceOfAbsensi(HIbernateUtil.config());
        for(Absensi absensi : list){
            Object[] anObject = {absensi.getTanggal(),absensi.getSiswa().getKodeSiswa()
                
            };
            this.defaultTableModel.addRow(anObject);
        }
    }

    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
    this.defaultTableModel=defaultTableModel;
    }
    
}
