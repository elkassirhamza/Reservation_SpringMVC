package org.example.Util;

import org.example.model.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Roles roles = new Roles();
        Apprenant apprenant =new Apprenant();
        Users users = new Users("elkassir","hamza","elkassirhamza@gmail.com","admin", admin, apprenant, roles);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction  = null;
        transaction = session.beginTransaction();

        session.save(users);
        transaction.commit();

    }
}
