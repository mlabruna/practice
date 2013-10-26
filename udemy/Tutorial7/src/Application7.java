import java.util.Scanner;


public class Application7 {

	public static void main(String[] args) {
		int loop = 1;
			loop = loop +8;
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("enter an integer");
		
		//Wait for the user to enter integer
		int value = input.nextInt();
		
		//tell them what they entered
		System.out.println("you entered: " + value);
		
		while(loop<45) {
		System.out.println(value*loop);
		}
	}
		
}
	