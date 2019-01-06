package com.bbbb.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotationController {
	@RequestMapping("/annotation")
	public ModelAndView jumpToAnnotationPage(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("word","大家好我是渣渣灰");
		mv.setViewName("annotation.jsp");
		return mv;
	}
}
