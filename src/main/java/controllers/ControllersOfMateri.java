/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import configuration.HIbernateUtil;
import interfaces.JavaControllers;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Jurusan;
import model.Materi;
import service.ServiceOfMateri;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfMateri implements JavaControllers {

    private DefaultTableModel defaultTableModel;
    

    public void initTable() {
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }

    public void loadDataTable(List<Materi> list) {
        initTable();
        ServiceOfMateri service = new ServiceOfMateri(HIbernateUtil.config());
        for (Materi aMateri : list) {
            Object[] anObjects = { aMateri.getKodeMateri(), aMateri.getNama(),
                aMateri.getPraktek(),aMateri.getJurusan().getKodeJurusan()};
            this.defaultTableModel.addRow(anObjects);

        }

    }
    
   
    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
    }

}
