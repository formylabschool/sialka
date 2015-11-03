/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sia.models.ModelOfCourses;

/**
 * @author muhamadhanifmuhsin
 */
public class ConfigOfCourses {

    /*klo mau tambahin entity tambahin disini pke metode addAnnotadedClass(NamaEntity.class)*/
    public static SessionFactory config() {
        return new Configuration().
                addAnnotatedClass(ModelOfCourses.class).
                /*addAnnotatedClass(KelasLain.class).*/
                setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect").
                setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver").
                setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/sia_lpkkanira").
                setProperty("hibernate.connection.username", "root").
                /*ubah passwordnya*/
                setProperty("hibernate.connection.password", "admin").
                setProperty("hibernate.hbm2ddl.auto","update").
                buildSessionFactory();
    }

}
