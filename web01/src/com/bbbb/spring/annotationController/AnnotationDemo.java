package com.bbbb.spring.annotationController;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotationDemo {
	@RequestMapping("/demo")
	public ModelAndView test(){
		org.springframework.web.servlet.ModelAndView mv = new ModelAndView();
		mv.addObject("key", "annotationDemo");
		mv.setViewName("testPage.jsp");
		return mv;
	}
	@RequestMapping("/demo2")
	public ModelAndView test2(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("key", "����һ��Controllerд�������ص�ַ");
		mv.setViewName("testPage2.jsp");
		return mv;
	}
	@RequestMapping("/demo3")
	public ModelAndView test3(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
//		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		System.out.println(request.getCharacterEncoding());
		System.out.println(name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("key","filter  setCharacterEncoding");
		mv.setViewName("testPage3.jsp");
		return mv;
	}
}
