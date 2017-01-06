package com.gwz.extension;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * intecepter after action start
 * @author ming
 *
 */
public class TracingAfterAdvice implements AfterReturningAdvice {

	public TracingAfterAdvice() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(method.getDeclaringClass().getName() + "." + method.getName() + "spend time:"+returnValue);
		System.out.println("execute after (by " + method.getDeclaringClass().getName() + "." + method.getName() + ")");
	}

}
