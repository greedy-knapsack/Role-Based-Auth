package com.jwt.RoleBasedAuthentication.service;

import com.jwt.RoleBasedAuthentication.model.Role;
import com.jwt.RoleBasedAuthentication.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository repository;
    public Role createNewRole(Role role){
        return repository.save(role);
    }
}
