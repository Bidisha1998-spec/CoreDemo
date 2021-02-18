import java.util.Scanner;

public class newstu {
	


		public static void main(String[] args) {
			
			Scanner in= new Scanner(System.in);
			
			System.out.println("Enter a Name and Course");
			String name = in.nextLine();
			String course = in.nextLine();
			System.out.println("Enter roll no.");
			int roll= in.nextInt();
			System.out.println("Enter marks of 5 subjects");
			double sub1= in.nextDouble();
			double sub2= in.nextDouble();
			double sub3= in.nextDouble();
			double sub4= in.nextDouble();
			double sub5= in.nextDouble();
			double totmarks = sub1+sub2+sub3+sub4+sub5;
			double percentage= (totmarks/500)*100;
			if(percentage>=90)
			{
				System.out.println("Distinction");
			}
			if(percentage<=89 && percentage>=60)
			{
				System.out.println("First class");
			}
			if(percentage<=59&& percentage>=40)
			{
				System.out.println("Second class");
			}
			if(percentage<40)
			{
				System.out.println("Fail");
			
			}
			else
			{
				System.out.println("Fail");
			}
			System.out.println("Name of the student:" +name);
			System.out.println("Roll no:" +roll);
			System.out.println("Course:" +course);
			System.out.println("Total marks obtained:" +totmarks);
			
			
			
			


			
			
			
			

		}

	}


