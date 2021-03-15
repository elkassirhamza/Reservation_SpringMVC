package org.example.Util;

import org.example.model.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
       /* Admin admin = new Admin();
        Roles roles = new Roles();
        Apprenant apprenant =new Apprenant();*/
        Roles roles = new Roles();
        roles.setIdRole(1L);
        Users users = new Users("test","test","test@gmail.com","admin", roles);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction  = null;
        transaction = session.beginTransaction();

        session.save(users);
        transaction.commit();

    }
}

