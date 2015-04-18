package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @author liyanlin  E-mail: liyl@shishike.com
 * @version 创建时间：2015年4月18日 下午6:18:26 
 * 类说明 
 */
/**
 * @author liyanlin
 *
 */
@Controller
@RequestMapping("/")
public class UserController {
	@RequestMapping("userController/login.do")
	public String index() {
		return "index";
	}
}
