package programming;

//import java.util.Arrays;
import java.util.List;

public class FP01StructuredFunctional {

	public static void main(String[] args) {
		/*
		 * List.of() was introduced in java 9 which is similar to Arrays.asList() in java 8
		 * */
//		List<Integer> numbers = List.of(12, 3, 4, 7, 5, 9, 8);
//		List<String> courses = List.of("ds-algo", "docker", "spring-framework", "dbms");
//		String word = "spring";
//		printAllNumbersInListStructured(numbers);
//		printAllNumbersInListFunctional(numbers);
//		printAllEvenNumbersInListFunctional(numbers);
//		printAllOddNumbersInListFunctional(numbers);
//		printCoursesContainingWord(courses, word);
//		printCoursesContainingAtLeastFiveLetters(courses);
//		printCubesOfOddNumbers(List.of(12, 3, 4, 5, 6, 9, 7));
//		System.out.println(sumOfListFunctional(List.of(12, 3, 4, 5, 6, 9, 7)));
	}
//	private static void printCoursesContainingAtLeastFiveLetters(List<String> courses) {
//		courses.stream()
//		.filter(course -> course.length() >= 5)
//		.forEach(System.out::println);
//	}
//	private static void print(int number) {
//		System.out.println(number);
//	}

//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}
//	
//	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
//		numbers.stream()
////		.filter(FP01StructuredFunctional::isEven)
//		.filter(number -> number % 2 == 0) // lambda expression
//		.forEach(System.out::println);
//	}

//	private static void printCoursesContainingWord(List<String> courses, String word) {
//		courses.stream()
//		.filter(course -> course.indexOf(word) != -1)
//		.filter(course -> course.contains(word)) // or
//		.forEach(System.out::println);
//	}

//	private static void printAllOddNumbersInListFunctional(List<Integer> numbers) {
//		numbers.stream()
//		.filter(number -> number % 2 != 0)
//		.forEach(System.out::println);
//	}

//	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		/*
		 * Here, we talk about what to do?
		 * */
//		numbers.stream().forEach(FP01StructuredFunctional::print); // Method reference syntax
		
//		numbers.stream().forEach(System.out::println);
//	}

//	private static void printAllNumbersInListStructured(List<Integer> numbers) {
//		/*
//		 * here, we talk about how to do the job?
//		 * */
//		for(int number : numbers) {
//			System.out.println(number);
//		}
//	}
//	private static void printCubesOfOddNumbers(List<Integer> numbers) {
//		numbers.stream()
//			.filter(number -> number % 2 != 0)
//			.map(number -> (int)Math.pow(number, 3))
//			.forEach(System.out :: println);
//	}
//	private static int sum(int aggregate, int nextNumber) {
//		return a + b;
//	}
//	private static int sumOfListFunctional(List<Integer> numbers) {
//		return numbers.stream()
////				.reduce(0, FP01StructuredFunctional :: sum);
////				.reduce(0, (a, b) -> a + b);
//				.reduce(0, Integer :: sum);
//	}

}
