package cn.springmvc.service;

import cn.springmvc.model.security.User;

/**
 * @author liyanlin
 *
 */
public interface UserService {
	public int insertUser(User user);
	
	public User loadUserByUsername(String userName);
}
