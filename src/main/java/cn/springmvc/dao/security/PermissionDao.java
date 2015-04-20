package cn.springmvc.dao.security;

import java.util.List;

import cn.springmvc.model.security.Permission;

/** 
 * @author liyanlin  E-mail: liyl@shishike.com
 * @version 创建时间：2015年4月19日 下午5:50:44 
 * 类说明 
 */
/**
 * @author liyanlin
 *
 */
public interface PermissionDao {

	/**
	 * @author liyanlin  E-mail: liyl@shishike.com
	 * @version 创建时间：2015年4月19日 下午5:59:38 
	 * @param url
	 * @return
	 */
	List<Permission> getPermissionByUrl(String url);

}
