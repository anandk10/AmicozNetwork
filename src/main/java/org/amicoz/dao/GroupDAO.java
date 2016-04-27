package org.amicoz.dao;

import java.util.Date;

import org.amicoz.ui.model.Group;


public interface GroupDAO {

	//public List<UserDetails> createGroup(String userEmailId);
	public Boolean saveGroupInfo(Group group);
	public Group getGroupInfo(int groupId);
	public Boolean insertUserGroupMapping(Group group);
	public int getGroupId();
}