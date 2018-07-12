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
import model.Jadwal;
import service.ServiceOfJadwal;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfPenjadwalan implements JavaControllers {

    private DefaultTableModel defaultTableModel;
    
    public void initTable(){
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }
    
   public void loadDataTable(List<Jadwal> list) {
        initTable();
        ServiceOfJadwal service = new ServiceOfJadwal(HIbernateUtil.config());
        for (Jadwal aJadwal : list) {
            Object[] anObjects = { aJadwal.getTanggal(),aJadwal.getKelas().getKodeKelas(),aJadwal.getRuangan().getId(),
                                   aJadwal.getJam(),aJadwal.getMateri().getNama(),aJadwal.getInstruktur().getNama()};
            this.defaultTableModel.addRow(anObjects);

        }

    }

    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
    }

      public DefaultTableModel getDefaultTableModel(){
        return defaultTableModel;
    }
}
