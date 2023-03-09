package com.connectify.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Comment {
	
	@Id
	private Integer postId;
	private String description;
	private Integer userId;
	private Long likes;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Comment> replys = new ArrayList<>();
	private LocalDateTime postTimeAndDate = LocalDateTime.now();
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

}
