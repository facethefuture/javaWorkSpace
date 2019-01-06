package com.bbbb.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HellowController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("home");
		String user = request.getParameter("user");
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("word", "今天天气很好");
		mv.setViewName("hellow.jsp");
		return mv;
	}

}
