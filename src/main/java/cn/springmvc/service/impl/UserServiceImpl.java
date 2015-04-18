package cn.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserDao;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}
}
