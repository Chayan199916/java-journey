package com.onetonteaching.enumdemo;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(Languages.C);
//		Languages.JAVA.show(); // shows star value
		
		
	}

}

//class Languages{
//	
//	static final Languages C = new Languages();
//	static final Languages JAVA = new Languages();
//	....
//	
//}

enum Languages{
	
	C(7), JAVA(7), PYTHON(6), JAVASCRIPT(6);
	
	int star;
	
	private Languages() {
		// TODO Auto-generated constructor stub
		star = 4;
	}
	
	private Languages(int star){
		
		this.star = star;
		
	}
	
	public void show() {
		
		System.out.println(star);
		
	}
	
}

