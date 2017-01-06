package com.gwz.extension;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
/**
 * intecepter before action start
 * @author ming
 *
 */
public class TracingBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("execute before (by " + method.getDeclaringClass().getName() + "." + method.getName() + ")");
	}

}
