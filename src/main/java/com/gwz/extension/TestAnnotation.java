package com.gwz.extension;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
/*import java.lang.annotation.Inherited;*/
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;




@Target(ElementType.FIELD) /*work area*/
@Retention(RetentionPolicy.RUNTIME) /*lifetime*/ 
/*@Inherited   if current annotation is used in class ,subclass will also inherit this annotation */
@Documented  /*generate document*/
public @interface TestAnnotation {

	public int id() default -1;
	
	public String name() default "";
}
