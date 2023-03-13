package com.connectify.services;

import com.connectify.exceptionHandling.CommentException;
import com.connectify.exceptionHandling.PostException;
import com.connectify.exceptionHandling.UserException;
import com.connectify.models.Comment;
import com.connectify.models.Post;

public interface PostServices {
	
	public Post post(Post post)throws PostException;
	public String deletePost(Integer postId)throws PostException;
	public String editPost(Integer postId,Post post)throws PostException;
	public Integer likedPost(Integer postId,Integer userId)throws PostException,UserException;
	public Integer unlikedPost(Integer postId,Integer userId)throws PostException,UserException;
    public Comment addComment(Comment comment,Integer postId)throws PostException,CommentException;
    public Comment replyComment(Comment comment,Integer parentCommentId)throws CommentException;

}
