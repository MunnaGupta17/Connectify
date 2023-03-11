package com.connectify.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectify.JPA.PostRepo;
import com.connectify.exceptionHandling.CommentException;
import com.connectify.exceptionHandling.PostException;
import com.connectify.models.Comment;
import com.connectify.models.Post;

public class PostServiceImpl implements PostServices{
	
	@Autowired
	private PostRepo pr;

	
	public boolean isPost(Integer postId) {
		Optional<Post> p = pr.findById(postId);
		if(p.isPresent()) {
			return true;
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
		Optional<Post> p = pr.findById(postId);
		if(p.isPresent()) {
			pr.delete(p.get());
			return "post deleted successfully";
		}else {
			return "wrong post id";
		}
	}

	@Override
	public String editPost(Integer postId,Post post) throws PostException {
		// TODO Auto-generated method stub
		if(post == null)throw new PostException("post is null");
		Optional<Post> pOptional = pr.findById(postId);
		if(pOptional.isPresent()) {
			Post p = pOptional.get();
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
	public Integer unlikedPost() throws PostException {
		// TODO Auto-generated method stub
		return null;
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
