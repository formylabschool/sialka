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
import model.Pembayaran;
import service.ServiceOfPembayaran;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfPembayaran implements JavaControllers {

    private DefaultTableModel defaultTableModel;

    public DefaultTableModel getDefaultTableModel() {
        return defaultTableModel;
    }

    public void initTable() {
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }

    public void loadDataTable(List<Pembayaran> list) {
        initTable();
        ServiceOfPembayaran service = new ServiceOfPembayaran(HIbernateUtil.config());
        for (Pembayaran aPembayaran : list) {
            Object[] anObjects = {aPembayaran.getNoPembayaran(), aPembayaran.getTanggal(),
                aPembayaran.getAmount(), aPembayaran.getSiswa().getKodeSiswa()

            };
            this.defaultTableModel.addRow(anObjects);
        }

    }

    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
    }

}
