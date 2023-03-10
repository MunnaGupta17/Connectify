package com.connectify.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connectify.models.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
