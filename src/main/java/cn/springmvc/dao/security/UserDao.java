/**
 * 
 */
package cn.springmvc.dao.security;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.springmvc.model.security.User;

@Repository
public interface UserDao {
	
	public int insertUser(User user);

	/**
	 * 通过用户名称查询用户
	 * @author liyanlin  E-mail: liyl@shishike.com
	 * @version 创建时间：2015年4月19日 下午3:36:59 
	 * @param userName
	 * @return
	 */
	public User getUserByLoginName(String userName);

	/**
	 * 通过用户名称登陆进行验证
	 * @author liyanlin  E-mail: liyl@shishike.com
	 * @version 创建时间：2015年4月19日 下午3:38:19 
	 * @param userName
	 * @return
	 */
	public List<String> loadUserAuthoritiesByName(String userName);
}
