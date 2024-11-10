package org.example.repository;

import org.example.model.Role;
import org.example.model.User;

import java.util.List;

public interface RoleRep {
    public List<Role> getRoles();
    public Role getRoleByName(String roleName);
}
