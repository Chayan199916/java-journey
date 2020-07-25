package com.onetonteaching.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class OwnAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D objD = new D();
		Class class1 = objD.getClass();
		Annotation annotation = class1.getAnnotation(Language.class);
		Language language = (Language) annotation;
		System.out.println(language.isTypeSafe());
		System.out.println(language.isObjectOriented());

	}

}

// Marker Annotation

// Meta Annotation

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Language{
	
	boolean isTypeSafe() default false;
	boolean isObjectOriented() default false;
	
}


@Language(isTypeSafe = true, isObjectOriented = true)
class D{
	
	
	
}