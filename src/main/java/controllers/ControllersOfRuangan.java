/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import configuration.HIbernateUtil;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Ruangan;
import service.ServiceOfRuangan;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfRuangan {
      private DefaultTableModel defaultTableModel;
    
    public void initTable(){
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }

    public void loadDataTable(List<Ruangan> list){
        initTable();
        ServiceOfRuangan service = new ServiceOfRuangan(HIbernateUtil.config());
        for (Ruangan aRuangan : list){
             Object[] anObjects = {aRuangan.getId(),aRuangan.getNama()};
             this.defaultTableModel.addRow(anObjects);
            
        }
        
    }
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
    }
    
    
}
