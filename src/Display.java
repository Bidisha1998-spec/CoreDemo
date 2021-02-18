
public class Display {

	public static void main(String[] args) {
		int i=1;
		System.out.println("Odd\tEven");
		while(i<=10) {
			
			if(i%2!=0)
			{
				System.out.print(i+"\t");
			}
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		i=i+1;
		}
	}

}
