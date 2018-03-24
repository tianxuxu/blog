package com.xaut.blog.resposity.user.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.xaut.blog.domain.user.User;
import com.xaut.blog.resposity.user.UserRepository;




@Repository
public class UserRepositoryImpl implements UserRepository {

	
	Map<Long,User> userMap=new ConcurrentHashMap<>(); 
	private AtomicLong id=new AtomicLong();
	
	@Override
	public void saveAndUpateUser(User user) {
		// TODO Auto-generated method stub
		/*if(user.getId()<=id.get()){
			userMap.put(user.getId(), user);
		}
		else{
			id.incrementAndGet();
			user.setId(id.get());
			userMap.put(id.get(), user);
		}*/
		Long id = user.getId();
		if (id == null) { // 新建
			id = this.id.incrementAndGet();
			user.setId(id);
		}
		this.userMap.put(id, user);
		//return user;

	}


	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
        this.userMap.remove(id);
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userMap.get(id);
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		
		return new ArrayList<User>(this.userMap.values());
	}

}
