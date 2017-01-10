package com.gwz.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO calling before action executing
		//log4
		 System.out.println("===========HandlerInterceptor preHandle");  
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO calling after action executed ,cut ModelAndView
		System.out.println("===========HandlerInterceptor postHandle");  
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===========HandlerInterceptor afterCompletion"); 
		super.afterCompletion(request, response, handler, ex);
	}

	public LoginInterceptor() {
		// TODO Auto-generated constructor stub
	}

}
