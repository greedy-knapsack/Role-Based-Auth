package com.jwt.RoleBasedAuthentication.repository;

import com.jwt.RoleBasedAuthentication.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,String> {
}
