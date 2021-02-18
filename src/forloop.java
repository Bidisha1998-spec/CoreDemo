import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1;
		int sum=0;
		System.out.println("enter value of n");
		int n= in.nextInt();
		while(i<=n)
		{
			sum= sum+i;
			i=i+1;
		
		}
		
		System.out.println(sum);
	}

}
