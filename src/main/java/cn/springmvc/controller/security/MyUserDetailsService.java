package cn.springmvc.controller.security;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cn.springmvc.dao.security.UserDao;
import cn.springmvc.model.security.Role;
import cn.springmvc.model.security.User;
import cn.springmvc.model.security.UserInfo;

import com.google.common.collect.Sets;

/** 
 * @author liyanlin  E-mail: liyl@shishike.com
 * @version 创建时间：2015年4月19日 下午3:28:58 
 * 类说明 
 */
/**
 * @author liyanlin
 *
 */
public class MyUserDetailsService implements UserDetailsService {
	@Resource
	private UserDao userDao;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findUserByLoginName(username);
		if (user == null) {
			throw new UsernameNotFoundException("用户" + username + " 不存在");
		}
		Set<GrantedAuthority> grantedAuths = obtainGrantedAuthorities(user);
		// -- mini-web示例中无以下属性, 暂时全部设为true. --//
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		UserInfo userdetails = new UserInfo(user.getPassword(), user.getName(), user.getEmail(), user.getLoginName(), grantedAuths, accountNonExpired, accountNonLocked, credentialsNonExpired, enabled);
		return userdetails;
	}

	/**
	 * 获得用户所有角色的权限集合.
	 */
	private Set<GrantedAuthority> obtainGrantedAuthorities(User user) {
		Set<GrantedAuthority> authSet = Sets.newHashSet();
		for (Role role : user.getRoleList()) {
			for (SimpleGrantedAuthority authority : role.getAuthorityList()) {
				authSet.add(new SimpleGrantedAuthority(authority.getAuthority()));
			}
		}
		return authSet;
	}
}
