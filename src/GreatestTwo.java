import java.util.Scanner;

public class GreatestTwo {

	public static void main(String[] args) {
		
		System.out.println("enter two numbers");
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		int b= in.nextInt();
		if(a>b)
		{
			System.out.println("the greatest no is:" +a);
		}
		else
		{
			System.out.println("The greatest no is:" +b);
		}
		in.close();
	}

}
