package org.example.repository;

import java.sql.SQLException;

public interface UserRepository {
    public boolean validate(String email,  String password)throws SQLException, ClassNotFoundException ;
}
