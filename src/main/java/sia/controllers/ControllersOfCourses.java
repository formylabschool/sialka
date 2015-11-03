/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.controllers;

import javax.swing.table.DefaultTableModel;
import sia.configuration.ConfigOfCourses;
import sia.interfaces.JavaControllers;
import sia.models.ModelOfCourses;
import sia.services.ServiceOfCourses;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ControllersOfCourses implements JavaControllers{
    private DefaultTableModel defaultTableModel;
    
    public void initTable(){
        this.defaultTableModel.getDataVector().removeAllElements();
        this.defaultTableModel.fireTableDataChanged();
    }

    public void loadDataTable(){
        initTable();
        ServiceOfCourses service = new ServiceOfCourses(ConfigOfCourses.config());
        for (ModelOfCourses aModelOfCourses : service.findAll()){
             Object[] anObjects = {aModelOfCourses.getCoursesCode(),aModelOfCourses.getCoursesName(),aModelOfCourses.getTheNumberOfHoursOfCourses()};
             this.defaultTableModel.addRow(anObjects);
            
        }
        
    }
    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
        loadDataTable();
    }
    
    
}
