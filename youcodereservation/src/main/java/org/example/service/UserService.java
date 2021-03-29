package org.example.service;

import org.example.model.Users;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public List<Users> findAll() throws ClassNotFoundException, SQLException;
    public Users findById(Long id) throws ClassNotFoundException, SQLException;
    public void save(Users user) throws ClassNotFoundException, SQLException;
    public void delete(Long id) throws ClassNotFoundException, SQLException;

    public String validate(String email,String password) throws ClassNotFoundException, SQLException;
    public Users getByEmail(String email);
}
