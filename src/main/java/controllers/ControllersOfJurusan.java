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
import model.Instruktur;
import model.Jurusan;
import service.ServiceOfInstruktur;
import service.ServiceOfJurusan;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfJurusan implements JavaControllers{
 private DefaultTableModel defaultTableModel;
    public void initTable(){
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }
    
     public void loadDataTable(List<Jurusan> list){
        initTable();
        ServiceOfJurusan service = new ServiceOfJurusan(HIbernateUtil.config());
        for (Jurusan aJurusan : list){
             Object[] anObjects = {aJurusan.getKodeJurusan(),aJurusan.getNama(),
                                   aJurusan.getJumlahPertemuan(),aJurusan.getHarga()};
             this.defaultTableModel.addRow(anObjects);
            
        }
        
    }
    
    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
    }
    
}
