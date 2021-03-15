package org.example.Dao;

import org.example.model.Users;

import java.util.List;

public interface UserDao {

    public void addUser(Users users);

    public void deleteUser(int id);

    public void updatetUser(Users users);

    public Users getUser(int id);

    public List<Users> listUser();



}
