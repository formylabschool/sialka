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
import model.Ruangan;
import service.ServiceOfInstruktur;
import service.ServiceOfRuangan;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfInstruktur implements JavaControllers {
private DefaultTableModel defaultTableModel;
    public void initTable(){
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }

    public void loadDataTable(List<Instruktur> list){
        initTable();
        ServiceOfInstruktur service = new ServiceOfInstruktur(HIbernateUtil.config());
        for (Instruktur aInstruktur : list){
             Object[] anObjects = {aInstruktur.getNip(),aInstruktur.getNama(),aInstruktur.getTempatLahir(),
                                   aInstruktur.getTanggalLahir(),aInstruktur.getJenisKelamin(),aInstruktur.getKontak(),aInstruktur.getEmail(),
                                   aInstruktur.getAlamat()};
             this.defaultTableModel.addRow(anObjects);
            
        }
        
    }
    
    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
    }
    
    
}
