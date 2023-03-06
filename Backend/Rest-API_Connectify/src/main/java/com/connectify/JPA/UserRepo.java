package com.connectify.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connectify.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
