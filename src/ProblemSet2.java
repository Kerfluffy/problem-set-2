/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
import java.util.Scanner;
public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("What's your first and last name?");
		Scanner scanner = new Scanner( System.in );
		System.out.print("Input your first name: ");
		String input = scanner.nextLine();
		System.out.print("Input your last name: ");
		String input2 = scanner.nextLine();
		System.out.println("Hello, " + input + " " + input2);
		scanner.close();
	}
	
	public void gradeMe() {
		
	}
	
	public void groupUs() {
		
	}
	
	public void info() {
		
	}
	
	public void initials() {
		
	}
}