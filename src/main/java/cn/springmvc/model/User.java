/**
 * 
 */ 
package cn.springmvc.model; 
/** 
 * @author liyanlin  E-mail: liyl@shishike.com
 * @version ����ʱ�䣺2015��4��18�� ����1:40:21 
 * �û���ӳ��
 */
/**
 * @author Administrator
 *
 */
public class User {
	private String userName;
	private String password;
	private Integer age;
	private Integer id;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}
