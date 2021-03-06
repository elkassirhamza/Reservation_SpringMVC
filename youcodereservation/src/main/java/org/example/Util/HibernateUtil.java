
package org.example.Util;
import org.example.model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory ;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Users.class)
                    .addAnnotatedClass(Admin.class)
                    .addAnnotatedClass(Roles.class)
                    .addAnnotatedClass(Apprenant.class)
                    .addAnnotatedClass(NbrPlace.class)
                    .addAnnotatedClass(Reservation.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}