import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		System.out.println("enter three numbers");
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		int b= in.nextInt();
		int c= in.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		else if(b>c)
		{
			System.out.println("b is greatest");
		}
		else
		{
			System.out.println("c is greatest");
		}
				
		}
		

	}


