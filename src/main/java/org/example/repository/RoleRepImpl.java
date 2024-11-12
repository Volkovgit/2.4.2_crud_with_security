package org.example.repository;

import org.example.model.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
@Transactional
public class RoleRepImpl implements RoleRep {

    @PersistenceContext
    private EntityManager em;

    private String SQL_GET_ROLE_BY_NAME = "select r from Role r where r.role =?1";


    @Override
    public Role getRoleByName(String roleName) {
        TypedQuery<Role> roleByNameQuery = em.createQuery(SQL_GET_ROLE_BY_NAME, Role.class);
        return roleByNameQuery.setParameter(1, roleName).getSingleResult();
    }
}
