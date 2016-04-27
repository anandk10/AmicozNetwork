package org.amicoz.controller;

import java.util.ArrayList;
import java.util.List;

import org.amicoz.dao.CommentsDAO;
import org.amicoz.dao.FriendDAO;
import org.amicoz.dao.PostDAO;
import org.amicoz.model.Post;
import org.amicoz.ui.model.Comment;
import org.amicoz.ui.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.google.gson.Gson;

@Controller
@SessionAttributes(value = {"s_emailid","s_userid","s_fullname","s_groupid","s_imgsrc"})
public class FrontPageController {

	@Autowired
	FriendDAO friendDAO;
	@Autowired
	PostDAO postDao;
	@Autowired
	CommentsDAO commentsDAO;
	
	@RequestMapping(value="/frontPage", method = RequestMethod.POST)
	public String fetchNewsFeed(ModelMap model){
		friendDAO.getFriendsDetails(1);
		List<Posts> posts = postDao.getFriendsPost(1);
		if(posts!=null && posts.size()!=0){
			for(Posts post: posts){
				ArrayList<Comment> comments = commentsDAO.getPostComments(post);
				//Collections.sort(comments);
				post.setComments(comments);
			}
			//Collections.sort(posts);
			Gson gson = new Gson();
			String friendPosts = gson.toJson(posts);
			System.out.println(friendPosts);
			
			model.addAttribute("friendsPosts", friendPosts);
			return "forward:/indexDtls";
		}
		model.addAttribute("friendsPosts","");
		return "forward:/indexDtls";
	}
	
}