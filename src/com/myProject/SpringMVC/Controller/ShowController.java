package com.myProject.SpringMVC.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowController {
	/**
	 * ึ๗าณ
	 * @author tianlei
	 * @since 2014.05.25
	 * @param
	 * @param
	 * @return
	 * */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response){
		ModelMap map = new ModelMap();
		String str="android";
		map.addAttribute("name",str);
		return new ModelAndView("index",map);
	}
}
