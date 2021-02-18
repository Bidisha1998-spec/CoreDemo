import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int a= scan.nextInt();
		if((a>1 && a<9) ||(a<0 && a>-9))
		{
			System.out.println("The no is single digit no");
		}
		else
		{
			System.out.println("not single digit");
		}
		

	}

}
