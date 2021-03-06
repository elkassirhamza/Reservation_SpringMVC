package org.example.service;

import org.example.Dao.UserDao;
import org.example.model.Users;
import org.example.repository.UserRepository;
import org.example.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;


@Service
@Component("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("UserDao")
    private UserDao userDao;

    private UserRepository userRepository = new UserRepositoryImpl();


    @Override
    @Transactional
    public List<Users> findAll() throws ClassNotFoundException, SQLException {
        return userDao.getAllUsers();
    }


    @Override
    @Transactional
    public Users findById(Long id) throws ClassNotFoundException, SQLException {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void save(Users user) throws ClassNotFoundException, SQLException {
        userDao.createUser(user);
    }

    @Override
    @Transactional
    public void delete(Long id) throws ClassNotFoundException, SQLException {
        userDao.dropUser(id);
    }


    @Override
    @Transactional
    public String validate(String email, String password) throws ClassNotFoundException, SQLException {
        return userRepository.validate(email, password);
    }

    @Override
    @Transactional
    public Users getByEmail(String email){
        return userRepository.getByEmail(email);
    }
}