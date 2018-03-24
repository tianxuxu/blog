package com.xaut.blog.resposity.user;

import java.util.List;

import com.xaut.blog.domain.user.User;





public interface UserRepository {

	public void saveAndUpateUser(User user);
	
	public void deleteUser(Long id);
	
	public User getUser(Long id);
	
	public List<User> listUsers();
}
