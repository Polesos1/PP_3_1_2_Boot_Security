package ru.kata.spring.boot_security.dao;



import ru.kata.spring.boot_security.model.Role;

import java.util.Set;

public interface RoleDao {
    Set<Role> getAllRoles();

    Set<Role> getByName(String name);

    void saveRole(Role role);

}

