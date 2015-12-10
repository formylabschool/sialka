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
import model.Kelas;
import model.Materi;
import service.ServiceOfKelas;
import service.ServiceOfMateri;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfKelas implements JavaControllers {
     private DefaultTableModel defaultTableModel;
    

    public void initTable() {
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }
    
    public void loadDataTable(List<Kelas> list) {
        initTable();
        ServiceOfKelas service = new ServiceOfKelas(HIbernateUtil.config());
        for (Kelas aKelas : list) {
            Object[] anObjects = { aKelas.getKodeKelas(), aKelas.getNamaKelas(),
                aKelas.getJurusan().getNama()};
            this.defaultTableModel.addRow(anObjects);

        }

    }

    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
       this.defaultTableModel = defaultTableModel;
    }
    
}
