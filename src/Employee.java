import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter employees Name");
		String name = in.nextLine();
		System.out.println("Enter employees address");
		String add = in.nextLine();
		
		System.out.println("Monthly Salary");
		double sal= in.nextDouble();
		double basic= 0.15*sal;
		double HRA= 0.10*sal;
		double DA= 0.5*sal;
		int PF= 1800;
		double netsal= (basic+HRA+DA)-PF;
		System.out.println("employees Name" +name);
		System.out.println("employees Address:" +add);
		System.out.println("employees Net Salary:" +netsal);
		
		
		
		
		
	}

}
