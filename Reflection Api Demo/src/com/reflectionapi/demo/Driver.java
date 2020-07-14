package com.reflectionapi.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class myClass = Class.forName("com.reflectionapi.demo.Demo"); // another way to create instance | fully qualified class name is must.
			Demo demo = (Demo) myClass.newInstance();
			Method method = myClass.getDeclaredMethod("show", null); // only for debugging purpose
			method.setAccessible(true);
			method.invoke(demo, null);
			
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
