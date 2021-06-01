package IFElse;
import java.util.Scanner;
public class Calculator2 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int answer = 0;
		
		System.out.println("Enter a Number : ");
		int num1 = in.nextInt();
		System.out.println("Enter another Number : ");
		int num2 = in.nextInt();
		System.out.println("Enter the opperand : ");
		char input = in.next().charAt(0);
		
		switch (input) {
		case '*' :
			answer = num1*num2;
			break;
		case '/' :
			answer = num1/num2;
			break;
		case '%' :
			answer = num1%num2;
			break;
		case '+' :
			answer = num1+num2;
			break;
		case '-' :
			answer = num1-num2;
			break;
			
		default:
			System.out.println("invalid command");
		}
		System.out.println("Ther result is : "+answer);
		
	}
}