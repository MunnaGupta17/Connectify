package com.connectify.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer postId;
	private String discription;
	/*
	 * the idea here is to save the user id of user in likes and pull the
	 * object when needed for fronted to show info about user
	 */
	private List<Integer> likes = new ArrayList<>();
	private List<String> comments = new ArrayList<>();
	private LocalDateTime postTimeAndDate = LocalDateTime.now();
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public List<Integer> getLikes() {
		return likes;
	}

	public void setLikes(List<Integer> likes) {
		this.likes = likes;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public LocalDateTime getPostTimeAndDate() {
		return postTimeAndDate;
	}

	public void setPostTimeAndDate(LocalDateTime postTimeAndDate) {
		this.postTimeAndDate = postTimeAndDate;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", discription=" + discription + ", likes=" + likes + ", comments=" + comments
				+ ", postTimeAndDate=" + postTimeAndDate + "]";
	}

	




	
	

}
