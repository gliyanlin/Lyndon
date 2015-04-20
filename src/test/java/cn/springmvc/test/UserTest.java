package cn.springmvc.test; 

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.model.security.User;
import cn.springmvc.service.UserService;

 
/**
 * @author liyanlin
 *
 */
public class UserTest {
	private UserService userService;	
    
    @Before
    
    public void before(){                                                                    
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
     
    @Test
    public void testadduser(){
        User user = new User();
        user.setUserName("liyanln");
        user.setPassword("123456");
        user.setAge(new Integer(28));
        System.out.println(userService.insertUser(user));
    }
}
