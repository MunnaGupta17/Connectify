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

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public List<Comment> getReplys() {
		return replys;
	}

	public void setReplys(List<Comment> replys) {
		this.replys = replys;
	}

	public LocalDateTime getPostTimeAndDate() {
		return postTimeAndDate;
	}

	public void setPostTimeAndDate(LocalDateTime postTimeAndDate) {
		this.postTimeAndDate = postTimeAndDate;
	}

	
	
}
