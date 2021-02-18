import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter no of elements");
		n= in.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]= in.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum:"+sum);
	}

}
