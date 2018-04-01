import java.util.*;

public class Arithmetic {

	public static void main(String[] args) {
		System.out.println("You can do your four arithmetic operations here: Addition, Subtraction"
				+ "Division, and Multiplication.");
		System.out.println("Enter the two numbers to perform the operation seperated by a space:");
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");
		
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Subraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));
		System.out.println("Division: " + (num1 / num2));	
		
		sc.close();
	}
}
