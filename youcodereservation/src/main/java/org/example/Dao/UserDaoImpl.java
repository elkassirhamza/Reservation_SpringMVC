package org.example.Dao;

import org.example.Util.HibernateUtil;
import org.example.model.Roles;
import org.example.model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public class UserDaoImpl implements UserDao{
    Session session;
    @Override

    public void createUser(Users user) {
        Session session = null;

        //Transaction transaction = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction  = null;
        transaction = session.beginTransaction();
        long theId = 2;
        Roles role = session.get(Roles.class, theId);
        user.setRoles(role);
        session.save(user);
        transaction.commit();

        /*Session session = null;
        Transaction transaction = null;*/
        /*try {

            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
            System.out.println("L'etudaint est bien creé !");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }*/
    }

    @Override
    public Users getUserById(Long id) {
        Users users = null;
        Session session = null;
        try {

            session = HibernateUtil.getSessionFactory().openSession();
            // get joueur by id
            users = (Users) session.get(Users.class, id);
            System.out.println("Le etudiant lu !");
        } finally {
            if (session != null) {
                session.close();
            }

        }

        return users;

    }

    @Override
    public List<Users> getAllUsers() {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Users> userList = session.createQuery("From Users ").list();
        session.getTransaction().commit();
        return userList;

    }

    @Override
    public void dropUser(Long id) {
        Users users = getUserById(id);
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.delete(users);
            transaction.commit();
            System.out.println("Etudiant Deleted !");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }

        }
    }

    @Override
    public Users updateUser(Users user) {
        Users userUp;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        // userUp = session.find(Users.class, user.getUserId());
        userUp = (Users) session.get(Users.class, user.getIdUsers());

        if (userUp != null){
            userUp.setIdUsers(user.getIdUsers());
            userUp.setPrenom(user.getPrenom());
            userUp.setNom(user.getNom());
            userUp.setEmail(user.getEmail());
            userUp.setPassword(user.getPassword());
            userUp.setRoles(user.getRoles());
            userUp.setStatus(user.isStatus());
            System.out.println("User updated");
        }else{
            System.out.println("User Not Exist");
        }
        session.getTransaction().commit();
        return userUp;
    }
}
