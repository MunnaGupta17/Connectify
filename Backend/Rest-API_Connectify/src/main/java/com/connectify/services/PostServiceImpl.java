package com.connectify.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectify.JPA.CommentRepo;
import com.connectify.JPA.PostRepo;
import com.connectify.JPA.UserRepo;
import com.connectify.exceptionHandling.CommentException;
import com.connectify.exceptionHandling.PostException;
import com.connectify.models.Comment;
import com.connectify.models.Post;
import com.connectify.models.User;

public class PostServiceImpl implements PostServices{
	
	@Autowired
	private PostRepo pr;
	@Autowired
	private CommentRepo cr;
	@Autowired
    private UserRepo ur;
	// this function is made cause of repeated code.
	public boolean isAvail(Integer id,String type) {
		if(type.equals("post")) {
			Optional<Post> post = pr.findById(id);
			if(post.isPresent())return true;
			else return false;
		}else {
		    Optional<Comment> comment = cr.findById(id);
		    if(comment.isPresent())return true;
		    else return false;
		}
	}
	// this function is made cause of repeated code.
	public Object getObject(Integer id,String type) {
		if(type.equals("post")) {
			Optional<Post> post = pr.findById(id);
			return post.get();
		}else if(type.equals("user")) {
			Optional<User> user = ur.findById(id);
			return user.get();
		}else {
		    Optional<Comment> comment = cr.findById(id);
		    return comment.get();
		}
	}
	
	@Override
	public Post post(Post post) throws PostException {
		// TODO Auto-generated method stub
		return pr.save(post);
	}

	@Override
	public String deletePost(Integer postId) throws PostException {
		// TODO Auto-generated method stub
		if(isAvail(postId,"post")) {
			Post p = (Post)getObject(postId,"post");
			pr.delete(p);
			return "post deleted successfully";
		}else {
			throw new PostException("wrong id");
		}
	}

	@Override
	public String editPost(Integer postId,Post post) throws PostException {
		// TODO Auto-generated method stub
		if(post == null)throw new PostException("post is null");
		if(isAvail(postId, "post")) {
			Post p = (Post)getObject(postId,"post");
			p.setDiscription(post.getDiscription());
			pr.save(p);
			return "post updated successfully";
		}else {
			throw new PostException("wrong postId");
		}
	}

	@Override
	public Integer likedPost(Integer postId,Integer userId) throws PostException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Integer unlikedPost(Integer postId,Integer userId) throws PostException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Comment addComment() throws PostException, CommentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment replyComment() throws CommentException {
		// TODO Auto-generated method stub
		return null;
	}

}
