package org.example.repository;

import org.example.Util.HibernateUtil;
import org.example.model.Roles;
import org.example.model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.sql.SQLException;

@Repository

public class UserRepositoryImpl implements UserRepository {


    @Override
    public String validate(String email, String password) throws SQLException, ClassNotFoundException{
        Transaction transaction = null;
        Users user = null;
        Roles role =null;
        try {
            // start a transaction
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            // get an user object
            user = (Users) session.createQuery("FROM Users U WHERE U.email= :email").setParameter("email", email)
                    .uniqueResult();

            if (user != null && user.getPassword().equals(password)&& user.getRoles().getIdRole().equals(1L)) {
                //return true;
                return "admin";
            }else if (user != null && user.getPassword().equals(password)&& user.getRoles().getIdRole().equals(2L)) {
                //return true;
                return "apprenant";
            }/*else if (user != null && user.getPassword().equals(password) && user.getRoles().getIdRole()==null) {
            //return true;
            return "apprenant";
        }*/
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return "false";
    }
    @Override
    public Users getByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query =  session.createQuery("from Users where email= :email");
        query.setParameter("email", email);
        try {
            Users user = (Users) query.getSingleResult();
            return user;
        }
        catch (Exception e){
            return null;
        }
    }
}

