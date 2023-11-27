
package cs141.jlhenry2;

import java.util.Scanner;

/**
 * @author jlhenry2
 *
 */
public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		double exam1;
		double exam2; 
		double exam3; 
		double avg = 0;
		
		System.out.println("You just took three tests! Now you want to know what the average of those test scores are...");
		System.out.println("What was the score on your first test?(1-100)");
		exam1 = scnr.nextDouble();
		System.out.println("What was the score on your second test?");
		exam2 = scnr.nextDouble();
		System.out.println("What was the score on your third test?");
		exam3 = scnr.nextDouble();
		
		avg = (exam1 + exam2 + exam3) / 3;
		
		if(avg < 60) {
			System.out.println("------------------------");
			System.out.println("Try better next time");
			System.out.println("Your grade is: F");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		else if(avg < 70) {
			System.out.println("------------------------");
			System.out.println("You're so close");
			System.out.println("Your grade is: D");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		else if(avg < 80) {
			System.out.println("------------------------");
			System.out.println("Don't give up");
			System.out.println("Your grade is: C");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		else if(avg < 90) {
			System.out.println("------------------------");
			System.out.println("Keep up the hard work!");
			System.out.println("Your grade is: B");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		else if(avg >= 90) {
			System.out.println("------------------------");
			System.out.println("AMAZING!!!");
			System.out.println("Your grade is: A");
			System.out.printf("Your average is: %.2f \n", avg);
			System.out.println("------------------------");
		}
		
		
		

	}

}

