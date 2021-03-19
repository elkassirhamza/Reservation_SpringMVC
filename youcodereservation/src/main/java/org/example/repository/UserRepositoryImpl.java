package org.example.repository;

import org.example.Util.HibernateUtil;
import org.example.model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository

public class UserRepositoryImpl implements UserRepository {


    @Override
    public boolean validate(String email, String password) throws SQLException, ClassNotFoundException{
        Transaction transaction = null;
        Users user = null;
        try {
            // start a transaction
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            // get an user object
            user = (Users) session.createQuery("FROM Users U WHERE U.email= :email").setParameter("email", email)
                    .uniqueResult();

            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }
}

