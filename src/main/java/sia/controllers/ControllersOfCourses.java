/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.controllers;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import sia.configuration.ConfigOfSIA;
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

    public void loadDataTable(List<ModelOfCourses> list){
        initTable();
        ServiceOfCourses service = new ServiceOfCourses(ConfigOfSIA.config());
        for (ModelOfCourses aModelOfCourses : list){
             Object[] anObjects = {aModelOfCourses.getCoursesCode(),aModelOfCourses.getCoursesName(),aModelOfCourses.getCoursesTheory(),aModelOfCourses.getCoursesPractice()};
             this.defaultTableModel.addRow(anObjects);
            
        }
        
    }
    @Override
    public void inijectTable(DefaultTableModel defaultTableModel) {
        this.defaultTableModel = defaultTableModel;
    }
    
    
}
