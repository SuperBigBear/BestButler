package com.gwz.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TestInterceptor implements MethodInterceptor {

	public TestInterceptor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		
		Object returnObject=invocation.proceed();
		
		return returnObject;
	}

}
