//package org.example.service;
//
//import org.example.model.Role;
//import org.example.model.User;
//import org.example.repository.RoleRep;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class RoleServiceImpl implements RoleService{
//
//    @Autowired
//    RoleRep roleRep;
//
//    @Override
//    public List<Role> getRoles() {
//        return roleRep.getRoles();
//    }
//
//
//    @Override
//    public Role getRoleByName(String roleName) {
//        return roleRep.getRoleByName(roleName);
//    }
//}
