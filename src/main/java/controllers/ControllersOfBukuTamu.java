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
import model.BukuTamu;
import service.ServiceOfBukuTamu;


/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfBukuTamu implements JavaControllers{
    private DefaultTableModel defaultTableModel;
    public void initTable(){
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }

    public void loadDataTable(List<BukuTamu> list){
        initTable();
        ServiceOfBukuTamu service = new ServiceOfBukuTamu(HIbernateUtil.config());
        for ( BukuTamu aBukuTamu : list){
             Object[] anObjects = {aBukuTamu.getTanggal(),aBukuTamu.getNama(),aBukuTamu.getKeperluan(),
                                   aBukuTamu.getYangDituju(),aBukuTamu.getAlamat()};
             this.defaultTableModel.addRow(anObjects);
            
        }
        
    }

    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
    }

    
}
