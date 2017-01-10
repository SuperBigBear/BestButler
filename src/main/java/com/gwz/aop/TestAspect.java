package com.gwz.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TestAspect {

	public TestAspect() {
		// TODO Auto-generated constructor stub
	}
	/*http://xiajava2011.iteye.com/blog/978877*/	
	public   void  doAfter(JoinPoint jp) {  
        System.out.println("log Ending method: "   
                + jp.getTarget().getClass().getName() + "."   
                + jp.getSignature().getName());  
    }  
  
    public  Object doAround(ProceedingJoinPoint pjp)  throws  Throwable {  
        long  time = System.currentTimeMillis();  
        Object retVal = pjp.proceed();  
        time = System.currentTimeMillis() - time;  
        System.out.println("process time: "  + time +  " ms" );  
        return  retVal;  
    }  
  
    public   void  doBefore(JoinPoint jp) {  
        System.out.println("log Begining method: "   
                + jp.getTarget().getClass().getName() + "."   
                + jp.getSignature().getName());  
    }  
  
    public   void  doThrowing(JoinPoint jp, Throwable ex) {  
        System.out.println("method "  + jp.getTarget().getClass().getName()  
                + "."  + jp.getSignature().getName() +  " throw exception" );  
        System.out.println(ex.getMessage());  
    }  
  
    private   void  sendEx(String ex) {  
        //TODO send text message or email 
    } 

}
