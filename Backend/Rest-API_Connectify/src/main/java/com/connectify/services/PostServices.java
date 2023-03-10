package com.connectify.services;

import com.connectify.exceptionHandling.CommentException;
import com.connectify.exceptionHandling.PostException;
import com.connectify.models.Comment;
import com.connectify.models.Post;

public interface PostServices {
	
	public Post post(Post post)throws PostException;
	public String deletePost(Integer postId)throws PostException;
	public String editPost(Integer postId,Post post)throws PostException;
	public Integer likedPost()throws PostException;
	public Integer unlikedPost()throws PostException;
    public Comment addComment()throws PostException,CommentException;
    public Comment replyComment()throws CommentException;

}
