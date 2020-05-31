package com.bjsxt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.service.PicService;

/**
 * @author wanglimin
 * @date 2020年4月5日 下午8:22:50
 *
 */
@Controller
public class PicController {
	@Resource
	private PicService picServiceImpl;
	@RequestMapping("/show")
	public String welcome(Model model){
		System.out.println("hello");
		model.addAttribute("list",picServiceImpl.show());
		return "/index.jsp";
	}
}
