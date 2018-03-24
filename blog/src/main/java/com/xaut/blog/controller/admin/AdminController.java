package com.xaut.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName :AdminController
 * @Description: admin控制器
 * @author: txx
 * @date: 2018年3月24日
 */
@Controller
@RequestMapping("/admins")
public class AdminController {

	public ModelAndView  listUsers(Model model){
		return new ModelAndView("admins/index","memuList",model);
	}
}
