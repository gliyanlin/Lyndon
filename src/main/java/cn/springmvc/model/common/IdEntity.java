package cn.springmvc.model.common; 

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/** 
 * @author liyanlin  E-mail: liyl@shishike.com
 * @version 创建时间：2015年4月19日 下午7:47:37 
 * 统一定义id的entity基类
 */
@MappedSuperclass
public class IdEntity {
	private Long id;  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {  
        return id;  
    }  
  
    public void setId(Long id) {  
        this.id = id;  
    }  
}
