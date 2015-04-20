package cn.springmvc.controller.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import cn.springmvc.dao.security.PermissionDao;
import cn.springmvc.model.security.Permission;

/** 
 * @author liyanlin  E-mail: liyl@shishike.com
 * @version 创建时间：2015年4月19日 下午3:31:50 
 * 类说明 
 */
/**
 * @author liyanlin
 *
 */
public class MySecurityMeadataSourceService implements FilterInvocationSecurityMetadataSource {
	@Resource
	private PermissionDao permissionDao;

	@Override
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
		String url = ((FilterInvocation) object).getRequestUrl();
		int firstQuestionMarkIndex = url.indexOf("?");
		if (firstQuestionMarkIndex != -1) {
			url = url.substring(0, firstQuestionMarkIndex);
		}
		System.out.println("url:" + url);
		List<ConfigAttribute> result = new ArrayList<ConfigAttribute>();
		ConfigAttribute attribute = new SecurityConfig("ROLE_BASE");
		result.add(attribute);
		try {
			List<Permission> permList = permissionDao.getPermissionByUrl(url);
			for (Permission permission : permList) {
				ConfigAttribute conf = new SecurityConfig(permission.getPermName());
				result.add(conf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
}
