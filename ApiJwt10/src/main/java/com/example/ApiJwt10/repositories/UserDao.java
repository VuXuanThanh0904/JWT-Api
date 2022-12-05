package com.example.ApiJwt10.repositories;

import com.example.ApiJwt10.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  extends CrudRepository<Users, Integer> {

    Users findByUsername(String username);
}
