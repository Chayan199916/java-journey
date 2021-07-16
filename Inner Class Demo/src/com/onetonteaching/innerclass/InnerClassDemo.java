package com.onetonteaching.innerclass;

import com.onetonteaching.innerclass.MemberClassDemo.NestedMember;

// types - member class, static class, anonymous class

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// inner member class

		// MemberClassDemo obj = new MemberClassDemo();
		// obj.i = 5;
		// MemberClassDemo.NestedMember obj1 = obj.new NestedMember(); // accessing
		// inner member class
		// obj1.j = 6;

		// inner static class

		// StaticClassDemo obj = new StaticClassDemo();
		// StaticClassDemo.NestedMemer obj1 = new StaticClassDemo.NestedMemer();
		// obj1.i = 5; // instance member of static inner class initialization
		// StaticClassDemo.NestedMemer.j = 0; // static member of static inner class
		// initialization

		// anonymous class

		// AnonymousClassDemo obj = new AnonymousClassDemo() {
		//
		// public void doSomething() {
		//
		// System.out.println("Displaying...");
		//
		// }
		//
		// };
		// obj.doSomething();

		// lambda expression with functional interface

		// AnonymousClassDemo obj = () -> System.out.println("Displaying");
		// obj.doSomething();

	}

}

/**
 * class inside a class is called inner class - member / non static class A{ int
 * i; class B{ int j; } } now from main() if we want to access i and j how
 * should we do that? after compilation there will be two classes A.class and
 * A$B.class so to access i ; A obj = new A() and then obj.i but to access j we
 * have to use A.B obj1 = obj.new B() and then obj1.j - static class A{ int i;
 * static class B{ int j; } } as class B is static we don't need object of A to
 * access B. so we can do like A.B obj = new A.B(); - anonymous let's say we
 * have a class which has a method caled display. Now if we want to use that
 * display we can create object of the class and then access display() now if we
 * want to modify the version of this display() we can go for method overriding
 * but in that case a new class will be required. there's an option called
 * anonymous class so we can give def while creating object. B obj = new B(){
 * void display(){ //new definition } }; in this case also a new class will be
 * created but name would be like RootClassName$1.class in java 8 we got a
 * feature called lambda expression. there's a concept called functional
 * interface (having only one method) before java 1.8 it's called single
 * abstract method(sam). So let's say Interface B{ void display(); } Now if we
 * want to use this method we can implement this interface and define the
 * method. but it would create another class. So we can use concept of anonymous
 * class here to give def to this display() lambda exp improves it further. so
 * using lambda exp we can remove all boiler plate code so, B obj = () -> {
 * //statements; } and in this case no extra class is created.
 */