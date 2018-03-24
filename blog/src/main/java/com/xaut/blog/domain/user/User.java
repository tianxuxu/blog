package com.xaut.blog.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *用户实体类 
 * @author 联想电脑
 *
 */

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;// 实体唯一一个标识

	@NotEmpty(message = "用户名称不能为空")
	@Size(min = 2, max = 18)
	@Column(length = 18)
	private String name;// 用户名称

	@NotEmpty(message = "邮箱不能为空")
	@Email(message = "邮箱格式不对")
	@Column(length = 18)
	private String email;// 用户邮箱

	@NotEmpty(message = "账号不能为空")
	@Size(min = 6, max = 18)
	@Column(length = 18)
	private String userName;

	@NotEmpty(message = "密码不能为空")
	@Size(max = 18, min = 6)
	@Column(length = 100)
	private String passWord;

	@Column(length = 200) // 限定长度
	private String avatar;// 图像地址

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	// 无参构造函数;设为 protected 防止直接使用
	protected User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("User[id=%d,name='%s',email='%s']", id, name, email);
	}

}
