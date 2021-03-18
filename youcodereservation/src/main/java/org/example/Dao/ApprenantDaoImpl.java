package org.example.Dao;

import org.example.Util.HibernateUtil;
import org.example.model.Apprenant;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ApprenantDaoImpl implements ApprenantDao{
    Session session;
    @Override
    public void createApprenant(Apprenant apprenant) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(apprenant);
        session.getTransaction().commit();



    }
}
