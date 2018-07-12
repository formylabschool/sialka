/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import interfaces.JavaControllers;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfNilai implements JavaControllers {

   private DefaultTableModel defaultTableModel;

    public DefaultTableModel getDefaultTableModel() {
        return defaultTableModel;
    }

    public void initTable() {
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }
    
   

    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;

    }

}
