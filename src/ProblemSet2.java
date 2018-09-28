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
		System.out.println("What is your first homework grade?");
		Scanner scanner2 = new Scanner( System.in );
			int homework1 = scanner2.nextInt(); 
		
		System.out.println("What is your second homework grade?");
			int homework2 = scanner2.nextInt();
		
		System.out.println("What is your third homework grade?");
			int homework3 = scanner2.nextInt();
		
		double average_homework = ((homework1 + homework2 + homework3) / 3);
		
		System.out.println("What is your first quiz score?");
			int quiz1 = scanner2.nextInt(); 
		
		System.out.println("What is your second quiz score?");
			int quiz2 = scanner2.nextInt();
		
		System.out.println("What is your third quiz score?");
			int quiz3 = scanner2.nextInt();
		
		double average_quiz = ((quiz1 + quiz2 + quiz3) / 3); 
		
		System.out.println("What is your first test score?"); 
			int test1 = scanner2.nextInt(); 
		
		System.out.println("What is your second test score?"); 
			int test2 = scanner2.nextInt(); 
		
		System.out.println("What is your third test score?"); 
			int test3 = scanner2.nextInt(); 
		
		double average_test = ((test1 + test2 + test3) / 3); 
		
		double final_grade = ((average_homework * .15) + (average_quiz * .3) + (average_test * .55));
		System.out.printf("Your final grade is %.2f!\n", final_grade);
		System.out.println(" ");
		scanner2.close();
	}
	
	public void groupUs() {
		System.out.println("How many students will be attending?");
		Scanner scanner3 = new Scanner( System.in );
			double students = scanner3.nextDouble(); 
		System.out.println("How many teachers will be attending?");
			double teachers = scanner3.nextDouble(); 
		scanner3.nextLine(); 
		
		int number_of_buses = (int) Math.ceil((students + teachers) / 46); 
			System.out.println("You need " + number_of_buses + " buses for the trip!");
			System.out.println(" ");
			scanner3.close();
	}
	
	public void info() {
		System.out.println("What is your first name?");
		Scanner scanner4 = new Scanner( System.in );
		String first_name = scanner4.nextLine(); 
		System.out.println("What is your last name?");
		String last_name = scanner4.nextLine(); 
		System.out.println("What grade are you in?");
		String grade_level = scanner4.nextLine(); 
		System.out.println("How old are you?");
		String age = scanner4.nextLine(); 
		System.out.println("What is your hometown?");
		String hometown = scanner4.nextLine(); 
		
		System.out.println("NAME     : " + first_name + " " + last_name);
		System.out.println("GRADE    : " + grade_level);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + hometown);
		System.out.println(" ");
		scanner4.close();
	}
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		Scanner scanner5 = new Scanner( System.in );
		char firstName = scanner5.nextLine().charAt(0); 
		System.out.print("Please enter your middle name: ");
		char middleName = scanner5.nextLine().charAt(0);
		System.out.print("Please enter your last name: ");
		char lastName = in.nextLine().charAt(0);
		
		System.out.println("Your initials are " + firstName + middleName + lastName + "!");
		scanner5.close();
	}
}