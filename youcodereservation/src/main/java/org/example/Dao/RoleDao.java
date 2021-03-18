package org.example.Dao;

import org.example.model.Roles;
import org.example.model.Users;

import java.util.List;

public interface RoleDao {
    public  void createRole(Roles role);
    public Users getRoleById(Long id);
    public List<Roles> getAllRoles();
    public void dropRole(Long id);
    public Users updateRole(Roles role);
}
