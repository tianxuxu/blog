package com.xaut.blog.jpa.user;

import org.springframework.data.repository.CrudRepository;

import com.xaut.blog.domain.user.User;






public interface UserRepository extends CrudRepository<User, Long>  {

}
