/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import configuration.HIbernateUtil;
import model.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class LoginManager {

    private static LoginManager loginManager;

    public static LoginManager getDefault() {

        if (loginManager == null) {

            loginManager = new LoginManager();

        }

        return loginManager;

    }

    private Login login;

    private LoginManager() {

        // singleton class
    }

    public Login getLogin() {

        return login;

    }

    public void logout() {

        this.login = null;

    }

    public boolean login(String namaPengguna, String kataSandi) {
      

        Session session = HIbernateUtil.config().openSession();

      Login db = (Login) session.get(Login.class, namaPengguna);

        session.close();

        if (db == null) {

            return false;

        } else if (!db.getKataSandi().equals(kataSandi)) {

            return false;

        } else {

            this.login = db;

            return true;

        }

    }
}
