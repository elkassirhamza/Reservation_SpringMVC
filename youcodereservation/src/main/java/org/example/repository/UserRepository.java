package org.example.repository;

import org.example.model.Users;

import java.sql.SQLException;

public interface UserRepository {
    public String validate(String email,  String password)throws SQLException, ClassNotFoundException ;
    public Users getByEmail(String email);
}
