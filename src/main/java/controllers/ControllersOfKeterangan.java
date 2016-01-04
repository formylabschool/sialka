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
import model.Keterangan;
import service.ServiceOfKeterangan;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfKeterangan implements JavaControllers {

    private DefaultTableModel defaultTableModel;

    public DefaultTableModel getDefaultTableModel() {
        return defaultTableModel;
    }

    public void initTable() {
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }
    
     public void loadDataTable(List<Keterangan> list) {
        initTable();
        ServiceOfKeterangan service = new ServiceOfKeterangan(HIbernateUtil.config());
        for (Keterangan aKeterangan : list) {
            Object[] anObjects = { aKeterangan.getMateri().getKodeMateri(), aKeterangan.getNamaKeterangan()};
            this.defaultTableModel.addRow(anObjects);

        }

    }

    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
    }

}
