package com.jwt.RoleBasedAuthentication.repository;

import com.jwt.RoleBasedAuthentication.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface RoleRepository extends CrudRepository<Role,String> {
}
