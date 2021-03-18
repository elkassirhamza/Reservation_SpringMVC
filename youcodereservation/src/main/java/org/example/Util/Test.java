package org.example.Util;

import org.example.Dao.*;
import org.example.model.*;
import org.hibernate.Session;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

       /* Roles roles = new Roles();
        roles.setIdRole(1L);
        Users users = new Users("elkas","admin2","admin@gmail.com","admin", roles);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction  = null;
        transaction = session.beginTransaction();

        session.save(users);
        transaction.commit();*/

        //Roles roles = new Roles();
        //roles.setIdRole(2L);
        //UserDao dao =new UserDaoImpl();
        //dao.createUser(new Users("elkassir","appren2","aappren2@gmail.com","admin",roles));
        //dao.dropUser(2L);
        //dao.updateUser(new Users(1L,"elkassir","hamza","hamza1@gmail.com","Admin123",roles));
        /*UserDao user =new UserDaoImpl();
        System.out.println(user.getAllUsers().toString());*/


        ////////////////////////////////////////////////////////////////////////////////////////////


           /*Users users = new Users("ggdgv", "hbdhh", "h@gmail.com","fdfgdg",roles);
        Apprenant apprenant = new Apprenant(users);
        userDao.createUser(users);*/


        /////TEST RESERVATION
        /*UserDao userDao = new UserDaoImpl();
        Roles roles = new Roles();
        roles.setIdRole(2L);

        Apprenant apprenant = new Apprenant();
        apprenant.setIdUsers(3L);


        Date date = new Date();

        Reservation reservation = new Reservation(date, false, apprenant);
        ReservationDao reserv = new ReservationDaoImpl();

        reserv.createReservation(reservation);


        ApprenantDao apprenantDao = new ApprenantDaoImpl();
        //Roles roles = new Roles();
        roles.setIdRole(2L);

        apprenantDao.createApprenant(new Apprenant("MOUHSSINE","ecchoufi","mouhssine@gmail.com","appre",roles));
*/


        //Add reservation//
        /*UserDao userDao = new UserDaoImpl();
        Roles roles = new Roles();
        roles.setIdRole(2L);

        Apprenant apprenant = new Apprenant();
        apprenant.setIdUsers(8L);


        Date date = new Date();
        ReservationDao reserv = new ReservationDaoImpl();

        Reservation reservation = new Reservation(date, false, apprenant);

        reserv.createReservation(reservation);*/






    }
}

