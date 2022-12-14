package ru.kata.spring.boot_security.service;

import ru.kata.spring.boot_security.model.Role;

import java.util.Set;


public interface RoleService {
    Set<Role> getAllRoles();
    Set<Role> getByName(String name);
    void saveRole(Role role);
}
