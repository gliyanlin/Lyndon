package cn.springmvc.model.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.springmvc.model.common.IdEntity;

/** 
 * @author liyanlin  E-mail: liyl@shishike.com
 * @version 创建时间：2015年4月20日 上午8:30:12 
 * 类说明 
 */
/**
 * @author liyanlin
 *
 */
@Entity  
@Table(name = "AUTHORITIES") 
public class Authority extends IdEntity {
	private String name;

	private String displayName;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the displayName
	 */
	@Column(name="display_name")  
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName
	 *            the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}
