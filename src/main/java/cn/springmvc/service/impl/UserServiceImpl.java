package cn.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.springmvc.dao.security.UserDao;
import cn.springmvc.model.security.User;
import cn.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.springmvc.service.UserService#loadUserByUsername(java.lang.String)
	 */
	@Override
	public User loadUserByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
}
