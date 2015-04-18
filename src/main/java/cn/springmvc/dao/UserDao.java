/**
 * 
 */
package cn.springmvc.dao;

import org.springframework.stereotype.Repository;

import cn.springmvc.model.User;

@Repository
public interface UserDao {
	public int insertUser(User user);
}
