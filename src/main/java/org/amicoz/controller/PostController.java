package org.amicoz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.amicoz.dao.PostDAO;
import org.amicoz.ui.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value = {"s_emailid","s_userid","s_fullname","s_groupid","s_imgsrc"})
public class PostController {

	@Autowired
	PostDAO postDao;
	
	@RequestMapping(value="/postSave", method = RequestMethod.POST)
	public void savePost(@ModelAttribute("Post")Posts post, HttpServletResponse response, ModelMap modelMap) throws IOException{
		System.out.println("In save post");
		PrintWriter out = response.getWriter();
		post.setUserID(1);
		post.setCommentCount(0);
		post.setLikeCount(0);
		post.setCommentCount(0);
		post.setComments(null);
		post.setPostVisibility("Y");
		//set current profile pic url
		post.setProfilePicURL("");
		System.out.println("trying to save.");
		if(postDao.addPost(post)){
			System.out.println("success");
			out.println(1);
		}else{
			out.println(0);
		}
	}
	
}