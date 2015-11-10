/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name="courses")
public class ModelOfCourses {
    @Id
    @Column(name="courses_code")
    private String coursesCode;
    @Column(name="courses_name")
    private String coursesName;
    @Column(name="courses_theory")
    private int coursesTheory;
    @Column(name="courses_practice")
     private int coursesPractice;

    public int getCoursesTheory() {
        return coursesTheory;
    }

    public void setCoursesTheory(int coursesTheory) {
        this.coursesTheory = coursesTheory;
    }

    public int getCoursesPractice() {
        return coursesPractice;
    }

    public void setCoursesPractice(int coursesPractice) {
        this.coursesPractice = coursesPractice;
    }
   

    public String getCoursesCode() {
        return coursesCode;
    }

    public void setCoursesCode(String coursesCode) {
        this.coursesCode = coursesCode;
    }

    public String getCoursesName() {
        return coursesName;
    }

    public void setCoursesName(String coursesName) {
        this.coursesName = coursesName;
    }

   
    
    
}
