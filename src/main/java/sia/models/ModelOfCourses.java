/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.models;

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
    @Column(name="tnhc")
    private int theNumberOfHoursOfCourses;

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

    public int getTheNumberOfHoursOfCourses() {
        return theNumberOfHoursOfCourses;
    }

    public void setTheNumberOfHoursOfCourses(int theNumberOfHoursOfCourses) {
        this.theNumberOfHoursOfCourses = theNumberOfHoursOfCourses;
    }
    
    
}
