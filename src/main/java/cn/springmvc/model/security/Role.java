package cn.springmvc.model.security;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

/** 
 * @author liyanlin  E-mail: liyl@shishike.com
 * @version 创建时间：2015年4月19日 下午5:25:21 
 * 类说明 
 */
/**
 * @author liyanlin
 *
 */
public class Role {
	private List<SimpleGrantedAuthority> authorityList;

	/**
	 * @return the authorityList
	 */
	public List<SimpleGrantedAuthority> getAuthorityList() {
		return authorityList;
	}

	/**
	 * @param authorityList
	 *            the authorityList to set
	 */
	public void setAuthorityList(List<SimpleGrantedAuthority> authorityList) {
		this.authorityList = authorityList;
	}
}
