/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ConfigOfCourses {
    public static SessionFactory config(){
        return new Configuration().configure().buildSessionFactory();
        
    }
    
}
