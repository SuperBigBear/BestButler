package com.gwz.extension;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * inteceptor when throwing exception
 * @author ming
 *
 */
public class TracingThrowsAdvice implements ThrowsAdvice {

	public TracingThrowsAdvice() {
		// TODO Auto-generated constructor stub
	}

	public void afterThrowing(Method method, Object[] args, Object target,Throwable subclass)
	{
		System.out.println("Logging that a "+subclass+" Exception was thrown.");
	}
}
