package com.connectify.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connectify.models.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{

}
