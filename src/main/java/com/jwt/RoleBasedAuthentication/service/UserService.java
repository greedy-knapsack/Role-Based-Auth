package com.jwt.RoleBasedAuthentication.service;

import com.jwt.RoleBasedAuthentication.model.Role;
import com.jwt.RoleBasedAuthentication.model.User;
import com.jwt.RoleBasedAuthentication.repository.RoleRepository;
import com.jwt.RoleBasedAuthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private RoleRepository roleRepository;
    public User registerNewUser(User user){
        return repository.save(user);
    }

    public void initRolesAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDesc("Admin Role");
        roleRepository.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDesc("Default role for newly created record");
        roleRepository.save(userRole);

        User adminUser = new User();
        adminUser.setUserFirstName("Admin");
        adminUser.setUserLastNme("admin");
        adminUser.setUserName("admin123");
        adminUser.setUserPassword("admin@pass");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        repository.save(adminUser);

        User newUser = new User();
        newUser.setUserFirstName("Utkarsh");
        newUser.setUserLastNme("Singh");
        newUser.setUserName("utkarsh241");
        newUser.setUserPassword("utkarsh@pass");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        newUser.setRole(userRoles);
        repository.save(newUser);
    }
}
